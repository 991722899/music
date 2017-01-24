package com.chao.music.service;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.chao.music.util.DBConnectionUtil;
import com.chao.music.vo.Singer;
import com.chao.music.vo.SingerType;

public class MusicService{
	private static final String singerListUrl = "http://music.163.com/discover/artist/cat?id=%s&initial=%s";
	private static final DocumentUtil documentUtil = new DocumentUtil();
	
	public List<Singer> getSingerBase(String url) throws IOException{	
		List<Singer> listSingers = new ArrayList<>();
		try {
			Document document = documentUtil.getDocument(url);
			List<Element> list = document.getElementById("m-artist-box").children();
			Element temp = null;
			List<Element> temps = null;
			String href = null;
			
			for(Element element : list){
				temps = element.select("p>a");
				if(temps==null || temps.size()==0){
					temps = element.select("a");
				}
				temp = temps.get(0);
				href = temp.attr("href");
				Singer singer = new Singer();
				singer.setName(temp.text());
				singer.setId(href.substring(href.indexOf("=")+1));
				listSingers.add(singer);
			}
			return listSingers;
		} catch (SocketTimeoutException e) {
			getSingerBase(url);
		}
		return listSingers;
		
	}
	
	public static void main(String[] args) {
		try {
			MusicService musicService = new MusicService();
			List<SingerType> singerTypes = musicService.getSingerTypes();
			int index = 0;
			for(SingerType singerType : singerTypes){
				List<Singer> list = new ArrayList<>();
				list.addAll(musicService.getSingerBase(String.format(singerListUrl,new Object[]{singerType.getId(),"-1"})));
				for(int i=65;i<91;i++){
					list.addAll(musicService.getSingerBase(String.format(singerListUrl,new Object[]{singerType.getId(),i})));
				}
				list.addAll(musicService.getSingerBase(String.format(singerListUrl,new Object[]{singerType.getId(),"0"})));
				
				Connection connection = DBConnectionUtil.getConnection();
				for(Singer singer : list){
					try {
						Statement statement = connection.createStatement();
						String sql = "insert into singer(id,name,type)values('"+singer.getId()+"','"+singer.getName().replace("'","\'")+"','"+singerType.getName()+"')";
						System.out.println(sql);
						statement.executeUpdate(sql);
						index++;
						System.out.println("�ɹ������֣�"+index);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("�ɹ�������������"+index);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public List<SingerType> getSingerTypes(){
		List<SingerType> singerTypes = new ArrayList<>();
		singerTypes.add(new SingerType("1001","�����и���"));
		singerTypes.add(new SingerType("1002","����Ů����"));
		singerTypes.add(new SingerType("1002","�������/�ֶ�"));
		
		singerTypes.add(new SingerType("2001","ŷ���и���"));
		singerTypes.add(new SingerType("2002","ŷ��Ů����"));
		singerTypes.add(new SingerType("2003","ŷ�����/�ֶ�"));
		
		singerTypes.add(new SingerType("6001","�ձ��и���"));
		singerTypes.add(new SingerType("6002","�ձ�Ů����"));
		singerTypes.add(new SingerType("6003","�ձ����/�ֶ�"));
		
		singerTypes.add(new SingerType("7001","�����и���"));
		singerTypes.add(new SingerType("7002","����Ů����"));
		singerTypes.add(new SingerType("7003","�������/�ֶ�"));
		
		singerTypes.add(new SingerType("4001","�����и���"));
		singerTypes.add(new SingerType("4002","����Ů����"));
		singerTypes.add(new SingerType("4003","�������/�ֶ�"));
		
		return singerTypes;
	}
}

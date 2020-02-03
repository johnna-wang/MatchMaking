package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.BaseDao;
import entity.People;

import dao.PeopleDao;


public class PeopleDaoImpl implements PeopleDao {

	public PeopleDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<People> findbysex_age(String sex, int age1, int age2,String religion) {
		// TODO Auto-generated method stub
		Connection conn = BaseDao.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<People> list = new ArrayList<People>();		
		try {
			pstm = conn.prepareStatement(
					"select * from information WHERE sex=? AND age>=? && age<=? and religion=?");
			pstm.setString(1, sex);
			pstm.setInt(2, age1);
			pstm.setInt(3, age2);
			pstm.setString(4,religion);
			rs = pstm.executeQuery();
			while(rs.next()){
				People people = new People();
				people.setAge(rs.getInt("age"));
				people.setCountry(rs.getString("country"));
				people.setDate(rs.getDate("date"));
				people.setEducation(rs.getString("education"));
				people.setLocation(rs.getString("location"));
				people.setMother_tongue(rs.getString("mother_tongue"));
				people.setName(rs.getString("name"));
				people.setProfession(rs.getString("profession"));
				people.setReligion(rs.getString("religion"));
				people.setSex(rs.getString("sex"));
				people.setStatus(rs.getString("status"));
				list.add(people);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, pstm, rs);
		}
		return list;
	}

	@Override
	public People findName(String name) {
		// TODO Auto-generated method stub

				Connection conn = BaseDao.getConn();
				PreparedStatement pstm = null;
				ResultSet rs = null;
		    	People people = null;	
				try {
					pstm = conn.prepareStatement(
							"select * from information WHERE name=?");
					pstm.setString(1, name);
					rs = pstm.executeQuery();
					while(rs.next()){
					    people = new People();
						people.setAge(rs.getInt("age"));
						people.setCountry(rs.getString("country"));
						people.setDate(rs.getDate("date"));
						people.setEducation(rs.getString("education"));
						people.setLocation(rs.getString("location"));
						people.setMother_tongue(rs.getString("mother_tongue"));
						people.setName(rs.getString("name"));
						people.setProfession(rs.getString("profession"));
						people.setReligion(rs.getString("religion"));
						people.setSex(rs.getString("sex"));
						people.setStatus(rs.getString("status"));
					
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					BaseDao.closeAll(conn, pstm, rs);
				}
				return people;
			}

	//×î¼ÑÆ¥Åä
	@Override
	public List<People> findBest(String name) {
		// TODO Auto-generated method stub
	
		Connection conn = BaseDao.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<People> list = new ArrayList<People>();	
		int age =0;
		String location=null;
		String mother_tongue =null;
		String profession = null;
		String religion = null;
		String sex = null;
		String status = null;
		//String sex1=null;
		
		try {
			pstm = conn.prepareStatement(
					"select * from information WHERE name=?");
			pstm.setString(1, name);
			
			rs = pstm.executeQuery();
			while(rs.next()){
				People people = new People();
			    people.setAge(rs.getInt("age"));
				people.setCountry(rs.getString("country"));
				people.setDate(rs.getDate("date"));
				people.setEducation(rs.getString("education"));
				people.setLocation(rs.getString("location"));
				people.setMother_tongue(rs.getString("mother_tongue"));
				people.setName(rs.getString("name"));
				people.setProfession(rs.getString("profession"));
				people.setReligion(rs.getString("religion"));
				people.setSex(rs.getString("sex"));
				people.setStatus(rs.getString("status"));
			
				 age =people.getAge();
				 location = people.getLocation();
				 mother_tongue = people.getMother_tongue();
				 profession = people.getProfession();
				 religion = people.getReligion();
				 sex = people.getSex();
				 status = people.getStatus();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, pstm, rs);
		}
			
			
			/*	if(sex.equals("ÄÐ")){
					 sex1 = "Å®";
				}
				if(sex.equals("Å®")){
					 sex1 = "ÄÐ";
				}*/
		
		Connection conn1 = BaseDao.getConn();
		PreparedStatement pstm1 = null;
		ResultSet rs1 = null;
					try {
						pstm1 = conn1.prepareStatement(
								"SELECT * FROM information ");
					
					//pstm.setString(1, sex1);
					rs1 = pstm1.executeQuery();
					
					while(rs1.next()){
						People people1 = new People();
						people1.setName(rs1.getString("name"));
					    people1.setAge(rs1.getInt("age"));
					    people1.setCountry(rs1.getString("country"));
						people1.setDate(rs1.getDate("date"));
						people1.setEducation(rs1.getString("education"));
						people1.setLocation(rs1.getString("location"));
						people1.setMother_tongue(rs1.getString("mother_tongue"));				
						people1.setProfession(rs1.getString("profession"));
						people1.setReligion(rs1.getString("religion"));
						people1.setStatus(rs1.getString("status"));
						people1.setSex(rs1.getString("sex"));
						
						//String name = people1.getName();
						int age1 =people1.getAge();						
						String location1 = people1.getLocation();
						String mother_tongue1 = people1.getMother_tongue();
						String profession1 = people1.getProfession();
						String religion1 = people1.getReligion();						
						String status1 = people1.getStatus();
						String sex1 = people1.getSex();
						
						int degree1,degree2,degree3,degree4,degree5,degree6,degree7;
						degree1=degree2=degree3=degree4=degree5=degree6=degree7=0;
						if(age1-age<2 ||age-age1<2){
							 degree1 = 20;
						}
						//System.out.print(age);
						//System.out.print(location);
						//System.out.print(location1);
						if(location.equals(people1.getLocation())){
							degree2 = 20;							
						}
						if(mother_tongue.equals(mother_tongue1)){
							 degree3 = 20;
						}
						if(profession.equals(profession1)){
							 degree4 = 10;
						}
						if(religion1.equals(religion)){
							 degree5 = 30;
						}
						if(status.equals(status1)){
							 degree6 = 20;
						}
						if(sex.equals(sex1)){
							degree7 = -1;
						}
						
						int degree = degree1+degree2+degree3+degree4+degree5+degree6;
						if(degree>100){
							degree = 100;
						}
						people1.setDegree(degree);
					
				if(degree7==0){
				list.add(people1);
				}
			}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						BaseDao.closeAll(conn1, pstm1, rs1);
					}
		
		return list;
	}
	}


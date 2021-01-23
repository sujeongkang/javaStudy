package com.practice.file.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		return new File(file).exists();
	}
	
	public void fileSave(String file,String s) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb=new StringBuilder();
		try(DataInputStream dis=new DataInputStream(new FileInputStream(file))){
			return sb.append(dis.readUTF());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file, String s) {
		StringBuilder sb=fileOpen(file);
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(file))){
			dos.writeUTF(sb+s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

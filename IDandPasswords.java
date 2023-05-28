/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussticketsystem;

import java.util.HashMap;

/**
 *
 * @author dbilguun
 */
public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Bilguun","123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}

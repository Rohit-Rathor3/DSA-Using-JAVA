package com.placement.array;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		int i=0;
		File f =new File("D:\\SPRING BY NATRAJ_SIR\\Spring\\Spring boot  Natrajsir\\Notes");
		String[] s =f.list();
		for(String fil1:s)
		{ //  String name = "D:\\SPRING BY NATRAJ_SIR\\Spring\\Spring boot  Natrajsir\\Notes"+fil1;
     		File f1 = new File(f,fil1);
			if(!fil1.contains("NTSPBMS615"))
			{
				f1.delete();
				i++;
				
			}
			//f1.delete();
			
		}
		System.out.println(i);
		System.out.println("===========DONE===========");
	}

}

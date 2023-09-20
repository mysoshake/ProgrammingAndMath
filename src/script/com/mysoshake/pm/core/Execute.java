package com.mysoshake.pm.core;

import java.util.concurrent.CopyOnWriteArraySet;

public class Execute
{
	private static CopyOnWriteArraySet<String> objects = null;
	
	static
	{
		objects = new CopyOnWriteArraySet<>();
	}
	
	public static ExeType go(String input)
	{
		String[] tokens = input.split(" ");
		
		ExeType ret = ExeType.NONE;
		
		if (tokens.length == 0)
		{
			ret = ExeType.ERROR;
		}
		else
		{
			switch (tokens[0].toLowerCase())
			{
			case "def":
			{
				System.out.println("定義コマンドです。なにもしません。");
				for (int i = 1; i < tokens.length; i++)
				{
					System.out.println(tokens[i] + "を定義するんですかね？");
				}
				ret = ExeType.DEFINE;
				break;
			}
			case "let":
			{
				System.out.println("何かの対象を登録します。");
				
				String new_obj_name = "";
				for (int i = 1; i < tokens.length; i++) new_obj_name += tokens[i];
				
				System.out.println("[" + new_obj_name + "] を登録してみます。");
				objects.add(new_obj_name);
				ret = ExeType.LET;
				break;
			}
			case "end", "quit":
			{
				System.out.println("終了します。");
				ret = ExeType.QUIT;
				break;
			}
			default:
			{
				System.out.println("エラー：知らんコマンドを打たないで");
				System.out.println("[" + input + "]");
				ret = ExeType.ERROR;
			}
			}
		}
		
		return ret;
	}
}

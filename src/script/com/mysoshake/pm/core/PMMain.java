package com.mysoshake.pm.core;

import com.mysoshake.pm.debug.log.Log;

public class PMMain
{
	public static void main(String[] args)
	{
		Log.Standard.print("起動");
		new Terminal();
		Log.Standard.print("終了");
	}
}

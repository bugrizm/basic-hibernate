package com.bugra.entity;

import java.nio.charset.Charset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlternateMain
{

    private static Logger logger = LogManager.getLogger(AlternateMain.class);

    public static void main(String[] args)
    {
        logger.info("LC_ALL:" + System.getenv("LC_ALL"));
        logger.info("Charset(file.encoding):" + Charset.defaultCharset().displayName());
        logger.info("Charset(file.encoding):" + Charset.defaultCharset().name());
        logger.info("file.encoding:" + System.getProperty("file.encoding"));

        try {
            foo();
        } catch(RuntimeException e) {
            System.out.println("exception catched");
        }

    }

    private static void foo() {
        throw new RuntimeException();
    }

}


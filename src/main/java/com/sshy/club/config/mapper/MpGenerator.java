package com.sshy.club.config.mapper;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MpGenerator {

	/**
	 * 代码生成路径
	 */
	private static final String OUTPUT_DIR = "E:\\club_server\\src\\main\\java";

	/**
	 * 代码注释作者
	 */
	private static final String AUTHOR = "YC";

	private static final String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	/**
	 * 数据库信息
	 */

	private static final String USERNAME = "sa";
	private static final String PASSWORD = "xxxxxxx";
	private static final String URL = "jdbc:sqlserver://xxxxxxxx:1433;databasename=xxxxxxxxxxxxxxxxxx";

	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();
		mpg.setGlobalConfig(buildGlobalConfig());
		// 数据源配置
		mpg.setDataSource(buildDataSourceConfig());
		// 包配置
		mpg.setPackageInfo(buildPackageConfig());
		// 自定义配置
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				// to do nothing
			}
		};
		mpg.setCfg(cfg);
		// 配置模板
		TemplateConfig templateConfig = new TemplateConfig();
		// 不生成mapper xml文件
		// templateConfig.setXml(null)
		mpg.setTemplate(templateConfig);

		// 策略配置
		mpg.setStrategy(buildStrategyConfig());
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());
		mpg.execute();
	}

	/**
	 * 全局构造配置类
	 *
	 * @return
	 */
	private static GlobalConfig buildGlobalConfig() {
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		// 项目所在地址
		gc.setServiceName("%sService");
		gc.setOutputDir(OUTPUT_DIR);
		// 注释作者
		gc.setAuthor(AUTHOR);
		// 生成文件打开
		gc.setOpen(true);
		
		gc.setFileOverride(true);
		gc.setActiveRecord(false);
		// XML 二级缓存
		gc.setEnableCache(false);

		gc.setBaseResultMap(true);
		// 生成java mysql字段映射
		// XML columList
		gc.setBaseColumnList(false);
		return gc;
	}

	/**
	 * 数据库配置信息
	 *
	 * @return
	 */
	private static DataSourceConfig buildDataSourceConfig() {
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl(URL);
		dsc.setDriverName(DRIVER_NAME);
		dsc.setUsername(USERNAME);
		dsc.setPassword(PASSWORD);
		dsc.setDbType(DbType.SQL_SERVER);
		return dsc;
	}

	private static PackageConfig buildPackageConfig() {
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.sshy.club");
		pc.setEntity("entity.RYTreasure");
		pc.setXml("mapper.RYTreasureDB.xml");
		pc.setService("serviceRYTreasure");
		pc.setServiceImpl("serviceRYTreasure.Impl");
		pc.setMapper("mapper.RYTreasureDB");
		return pc;
	}

	private static StrategyConfig buildStrategyConfig() {
		StrategyConfig strategy = new StrategyConfig();
		// 命名规则
		strategy.setNaming(NamingStrategy.no_change);
		//strategy.setColumnNaming(NamingStrategy.no_change);
		strategy.setInclude(new String[] { "GameColumnItem" });
	    strategy.setEntityTableFieldAnnotationEnable(true);
		return strategy;
	}
}

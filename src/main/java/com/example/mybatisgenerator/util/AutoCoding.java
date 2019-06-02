package com.example.mybatisgenerator.util;

import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;


/**
 * @Description
 * @author dcx
 * @date 2019年6月2日 下午4:57:17
 */
public class AutoCoding {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("mybatis-plus");
		AutoGenerator autoGenerator = new AutoGenerator();
		// 设置使用freemarker模板
		autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
		// 全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		globalConfig.setAuthor(bundle.getString("author"));
		globalConfig.setOpen(false);
		globalConfig.setSwagger2(true);
		//globalConfig.setDateType(DateType.ONLY_DATE);
		autoGenerator.setGlobalConfig(globalConfig);
		// 数据源配置
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL);
		dataSourceConfig.setUrl(bundle.getString("url"));
		dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
		dataSourceConfig.setUsername(bundle.getString("username"));
		dataSourceConfig.setPassword(bundle.getString("password"));
		autoGenerator.setDataSource(dataSourceConfig);
		// 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.baomidou.ant");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        autoGenerator.setPackageInfo(pc);
		//自定义模板
		TemplateConfig templateConfig = new TemplateConfig();
		autoGenerator.setTemplate(templateConfig);
		//注入属性
		InjectionConfig injectionConfig = new InjectionConfig() {
			
			@Override
			public void initMap() {
				Map<String, Object> newHashMap = Maps.newHashMap();
				newHashMap.put("abc", "dcx");
				this.setMap(newHashMap);
				
			}
		};
		ArrayList<FileOutConfig> fileOutConfigs = Lists.newArrayList();
		 // 自定义输出配置
		injectionConfig.setFileOutConfigList(fileOutConfigs);
		autoGenerator.setCfg(injectionConfig);
		// 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setInclude(new String[]{"videos"});
        autoGenerator.setStrategy(strategy);
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        autoGenerator.execute();
	}
	private void mysqlConvert() {
		
	}
}

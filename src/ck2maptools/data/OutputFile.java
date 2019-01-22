package ck2maptools.data;

import java.io.File;

public enum OutputFile {

	AlternateStart("./output/common/alternate_start/01_spread.txt"),
	Dynasties("./output/common/dynasties/auto_generated_dynasties.txt"),
	LandedTitles("./output/common/landed_titles/autogenerated_landed_titles.txt"),
	LandedTitlesPat("./output/common/landed_titles/autogenerated_landed_titles_patricians.txt"),
	LandedTitlesMerc("./output/common/landed_titles/autogenerated_mercenary_titles.txt"),
	HistoryCharacters("./output/history/characters/auto_generated_characters.txt"),
	HistoryProvincesFolder("./output/history/provinces"),
	HistoryTechnology("./output/history/technology/autogenerated_technology.txt"),
	HistoryTitlesFolder("./output/history/titles"),
	Localisation("./output/localisation/00_provinces_and_titles.csv"),
	Adjacencies("./output/map/adjacencies.csv"),
	Climate("./output/map/climate.txt"),
	Continent("./output/map/continent.txt"),
	Default("./output/map/default.map"),
	Definitions("./output/map/definition.csv"),
	Regions("./output/map/geographical_region.txt"),
	IslandRegions("./output/map/island_region.txt"),
	Positions("./output/map/positions.txt"),
	Provinces("./output/map/provinces.bmp"),
	Rivers("./output/map/rivers.bmp"),
	Terrain("./output/map/terrain.bmp"), //Also an input file
	Topology("./output/map/topology.bmp"),
	Trees("./output/map/trees.bmp"),
	Normals("./output/map/world_normal_height.bmp"),
	Statics("./output/map/statics/00_static.txt"),
	ColorMap("./output/map/terrain/colormap.dds"),
	ColorMapWater("./output/map/terrain/colormap_water.dds");
	
	private String fileName;
	
	private OutputFile(String fileName)
	{
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	
	public boolean exists() {
		File f = new File (fileName);
		return f.exists();
	}

}

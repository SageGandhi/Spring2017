# GitRepo
Spring Core 4.3.9 RELEASE
ThymeLeaf By Example
[![License: CC BY 4.0](https://licensebuttons.net/l/by/4.0/80x15.png)](http://creativecommons.org/licenses/by/4.0/)

out.println("========================================================================");
		final Map<Integer,List<String>> joiningMapList=new HashMap<>();
		joiningMapList.computeIfAbsent(2017,ArrayList<String>::new).addAll(Arrays.asList("Prajit","Prakash","Swagat"));
		out.println("Before To UpperCase:"+joiningMapList);
		joiningMapList.computeIfPresent(2017,(key,value)->{
			value.removeIf(item->item.startsWith("Swag"));
			return value.stream().map(String::toUpperCase).collect(Collectors.toList());			
		});
out.println("After To UpperCase:"+joiningMapList);
out.println("========================================================================");

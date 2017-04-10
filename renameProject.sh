if [ ! -z "$1" -a "$1" != " " ]; then

	if [ -d ".idea" ]; then
		rm -r .idea/
	fi

	cd ..

	if [ ! -z "$2" -a "$2" != " " ]; then
	     	var="name := \"\"\"$1\"\"\""
	     	sed -i "1s/.*/$var/" $2/build.sbt 
		mv $2 $1
	else
	     	var="name := \"\"\"$1\"\"\""
	     	sed -i "1s/.*/$var/" base-project/build.sbt 
		mv base-project $1
	fi

fi




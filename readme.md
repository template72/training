[![Release](https://jitpack.io/v/template72/training.svg)]
(https://jitpack.io/#template72/training)

# training

I use this github project to train publishing to github. It's about committing,
writing a README, constructing a build and test coverage process and last but not
least writing a nice Wiki.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Installation

Gradle

```gradle
dependencies {
	compile 'com.github.template72:training:0.1.0'
}

repositories {
	...
	maven { url 'https://jitpack.io' }
}
```

Maven

```xml
<dependency>
    <groupId>com.github.template72</groupId>
    <artifactId>training</artifactId>
    <version>0.1.0</version>
</dependency>

<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```

[See jitpack.io for other build tools or other versions](https://jitpack.io/#template72/training)


## Usage
This library is simple to use. Just use the Adder class and perform operations.

```java
Adder adder = new Adder();
int result = adder.add(1, 2);
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b feature-name`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin feature-name`
5. Submit a pull request

## License
MIT

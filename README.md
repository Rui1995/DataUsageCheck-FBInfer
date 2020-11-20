## Data Usage Check

This analysis uses Abstract Interpretation to detect Unused Input Variables in Java programs.
The analysis is built using the framework [Infer.AI](http://fbinfer.com).

## Installation
To install this analysis, follow these steps:

1. Clone this repository:

`git clone --recurse-submodules https://github.com/Rui1995/DataUsageCheck-FBInfer`

2. Build Infer. If all the requirements are met, the following steps should be enough:

```
cd DataUsageCheck-FBInfer/
./build-infer.sh java
```

See [Getting Started](http://fbinfer.com/docs/getting-started) for information about the installation of Infer and the required dependencies.


## Usage
After Infer is installed, inside the folder where the Java program to be analyzed is located, execute:

`infer -g --data-usage-check-only -- javac JavaFileToBeTested.java`

For example, inside the `Benchmark` folder: 

`infer -g --data-usage-check-only -- javac Dict_example.java`

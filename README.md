## Data Usage Check

This analysis uses Abstract Interpretation to detect Unused Input Variables in Java programs.
The analysis is built using the framework [Infer.AI](http://fbinfer.com).

## Installation
To install Infer please head to [Getting Started](http://fbinfer.com/docs/getting-started) for information about the installation of Infer.

## Usage
After Infer is installed, inside the folder where the Java program to be analyzed is located, execute:

`infer -g --data-usage-check-only -- javac JavaFileToBeTested.java`

For example, inside the `Benchmark` folder: 

`infer -g --data-usage-check-only -- javac BRCA_example.java`

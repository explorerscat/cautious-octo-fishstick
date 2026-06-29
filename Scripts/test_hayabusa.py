#!/usr/bin/env python3
import subprocess
import sys

def test_communication():
    print("Running Hayabusa2 communication check...")
    res = subprocess.run(["make", "run"], capture_output=True, text=True)
    if res.returncode != 0:
        print("Error: Make run failed")
        print(res.stderr)
        sys.exit(1)
        
    output = res.stdout
    lines = output.strip().split("\n")
    
    found = False
    for line in lines:
        if "JAXA Hayabusa2 Probe Status Response:" in line or "JAXA Hayabusa2 Probe Offline:" in line:
            print(f"Success: Found Hayabusa2 output line -> {line}")
            found = True
            break
            
    if not found:
        print("Error: Hayabusa2 communication output line not found in stdout!")
        print("Actual Output:")
        print(output)
        sys.exit(1)
        
    print("✅ test_hayabusa passed successfully!")

if __name__ == "__main__":
    test_communication()

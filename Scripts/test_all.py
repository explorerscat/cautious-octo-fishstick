#!/usr/bin/env python3
import subprocess
import sys

# ponytail: comprehensive assertion check for issue 1 & issue 2

def run_test():
    print("Running assertion test suite...")
    res = subprocess.run(["make", "run"], capture_output=True, text=True)
    if res.returncode != 0:
        print("Build/Run failed:", res.stderr)
        sys.exit(1)
        
    output = res.stdout
    lines = output.strip().split("\n")
    
    # Assertions for Horoscope
    horoscope_line = [l for l in lines if l.startswith("Horoscope:")]
    assert horoscope_line, "Horoscope output not found"
    val = float(horoscope_line[0].split(":")[1].strip())
    assert val > 0.0, f"Expected non-zero positive horoscope value, got {val}"
    
    # Assertions for Hayabusa2 Communication
    hayabusa_line = [l for l in lines if l.startswith("JAXA Hayabusa2")]
    assert hayabusa_line, "Hayabusa2 communication output not found"
    assert "Response: 200" in hayabusa_line[0], f"Expected response 200, got: {hayabusa_line[0]}"
    
    # Assert Teuton was converted to Blue
    teuton_states = [l for l in lines if l.startswith("Teuton has a")]
    assert len(teuton_states) >= 2, "Teuton states not printed"
    assert "Blue-colour shirt" in teuton_states[-1], f"Expected Teuton to be converted to Blue, got: {teuton_states[-1]}"
    
    print("✅ All assertion checks passed successfully!")

if __name__ == "__main__":
    run_test()

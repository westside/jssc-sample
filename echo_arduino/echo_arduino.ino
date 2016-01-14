void setup() {
  Serial.begin(9600);
  
  // put your setup code here, to run once:

}

void loop() {
  if (Serial.available()) {
    while (Serial.available()) {
      char a = Serial.read();
      Serial.write(a);
    }
    
  }
}

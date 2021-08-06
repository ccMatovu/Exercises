//
// This is only a SKELETON file for the 'Triangle' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Triangle {
  constructor(x,y,z) {
    this.side1 = x;
    this.side2 = y;
    this.side3 = z;

    (x + y + x) == 0 ? this.isTriangle = false : this.isTriangle = true; 

    if(((x+y) < z) || ((x+z) <y) || ((z+y)<x)){
      this.isTriangle = false;
    }
   
  }

  get isEquilateral() {
    if(this.isTriangle){
     if((this.side1 == this.side2) && (this.side2 == this.side3)){
      return true;
    }
    }
    return false;
  }

  get isIsosceles() {
    if(this.isTriangle){
      if((this.side1 == this.side2) || (this.side1 == this.side3) || this.side3 == this.side2){
       
        return true;
      }
    }
    return false;
    }

  get isScalene() {
    if(this.isTriangle){
      if((this.side1 != this.side2) && (this.side1 != this.side3) && (this.side3 != this.side2)){
        return true;
      }
    }
    return false;
    }

      
    
}

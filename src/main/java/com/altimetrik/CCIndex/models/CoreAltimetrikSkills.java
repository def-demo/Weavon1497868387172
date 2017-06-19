package com.altimetrik.CCIndex.models;


import java.util.Objects;


import org.springframework.data.annotation.Id;





public class CoreAltimetrikSkills  {
  
  
   
   
  
  private String skillname = null;
  
   
   
  
  private String skilltype = null;
  
   
   
  
  private String grade = null;

  
  /**
   * {}
   **/
  public String getSkillname() {
    return skillname;
  }
  public void setSkillname(String skillname) {
    this.skillname = skillname;
  }

  
  /**
   * {}
   **/
  public String getSkilltype() {
    return skilltype;
  }
  public void setSkilltype(String skilltype) {
    this.skilltype = skilltype;
  }

  
  /**
   * {}
   **/
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreAltimetrikSkills coreAltimetrikSkills = (CoreAltimetrikSkills) o;
    return Objects.equals(skillname, coreAltimetrikSkills.skillname) &&
        Objects.equals(skilltype, coreAltimetrikSkills.skilltype) &&
        Objects.equals(grade, coreAltimetrikSkills.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillname, skilltype, grade);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreAltimetrikSkills {\n");
    
    sb.append("  skillname: ").append(skillname).append("\n");
    sb.append("  skilltype: ").append(skilltype).append("\n");
    sb.append("  grade: ").append(grade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


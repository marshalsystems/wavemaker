/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wavemaker.runtime.data.sample.db2sampledb;
// Generated Feb 7, 2008 1:47:51 PM by Hibernate Tools 3.2.0.CR1



/**
 * EmpResumeId generated by hbm2java
 */
@SuppressWarnings({"serial"})
public class EmpResumeId  implements java.io.Serializable {


     private String empno;
     private String resumeFormat;

    public EmpResumeId() {
    }

    public EmpResumeId(String empno, String resumeFormat) {
       this.empno = empno;
       this.resumeFormat = resumeFormat;
    }
   
    public String getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(String empno) {
        this.empno = empno;
    }
    public String getResumeFormat() {
        return this.resumeFormat;
    }
    
    public void setResumeFormat(String resumeFormat) {
        this.resumeFormat = resumeFormat;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EmpResumeId) ) return false;
		 EmpResumeId castOther = ( EmpResumeId ) other; 
         
		 return ( (this.getEmpno()==castOther.getEmpno()) || ( this.getEmpno()!=null && castOther.getEmpno()!=null && this.getEmpno().equals(castOther.getEmpno()) ) )
 && ( (this.getResumeFormat()==castOther.getResumeFormat()) || ( this.getResumeFormat()!=null && castOther.getResumeFormat()!=null && this.getResumeFormat().equals(castOther.getResumeFormat()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmpno() == null ? 0 : this.getEmpno().hashCode() );
         result = 37 * result + ( getResumeFormat() == null ? 0 : this.getResumeFormat().hashCode() );
         return result;
   }   


}


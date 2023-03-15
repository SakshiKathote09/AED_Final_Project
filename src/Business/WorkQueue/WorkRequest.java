/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * 
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String childName;
    private String sex;
    private String Ethnicity;
    private String whenFound;
    private String whereFound;
    private String describe;
    private String parentDetails;
    private String report;
    private String knownIssues;
    private String medicalStatus;
    private String medicalReport;
    private String tests;
    private UserAccount doctor;
    private UserAccount assistant;
    private String testReport;
    private String imagePath;
    private String xray;
    private String ctScan;
    private Date date;
    private Boolean add;
    private String parent;
    private String lawyer;
    private Boolean approval;
    private int age;
    private String parentsex;
    private String occupation;
    private double SSN;
    private double annualIncome; 
    private double liabilies;
    private String partner;
    private double savings;
    private String donorname;
    private double donationamount;
    private String donormessage;
    static private String highestdonor;
    static private double highestdonoramount=0;

    public static double getHighestdonoramount() {
        return highestdonoramount;
    }

    public static void setHighestdonoramount(double highestdonoramount) {
        WorkRequest.highestdonoramount = highestdonoramount;
    }

    public static String getHighestdonor() {
        return highestdonor;
    }

    public static void setHighestdonor(String highestdonor) {
        WorkRequest.highestdonor = highestdonor;
    }

    public static double getBankbalance() {
        return bankbalance;
    }

    public static void setBankbalance(double bankbalance) {
        WorkRequest.bankbalance = bankbalance;
    }
    static private double bankbalance;
    private String bankapproval;

    public String getBankapproval() {
        return bankapproval;
    }

    public void setBankapproval(String bankapproval) {
        this.bankapproval = bankapproval;
    }
    public String getDonorname() {
        return donorname;
    }

    public void setDonorname(String donorname) {
        this.donorname = donorname;
    }

    public double getDonationamount() {
        return donationamount;
    }

    public void setDonationamount(double donationamount) {
        this.donationamount = donationamount;
    }

    public String getDonormessage() {
        return donormessage;
    }

    public void setDonormessage(String donormessage) {
        this.donormessage = donormessage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentsex() {
        return parentsex;
    }

    public void setParentsex(String parentsex) {
        this.parentsex = parentsex;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSSN() {
        return SSN;
    }

    public void setSSN(double SSN) {
        this.SSN = SSN;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getLiabilies() {
        return liabilies;
    }

    public void setLiabilies(double liabilies) {
        this.liabilies = liabilies;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public Boolean getApproval() {
        return approval;
    }

    public void setApproval(Boolean approval) {
        this.approval = approval;
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }


    public Boolean getAdd() {
        return add;
    }

    public void setAdd(Boolean add) {
        this.add = add;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getXray() {
        return xray;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }

    public String getCtScan() {
        return ctScan;
    }

    public void setCtScan(String ctScan) {
        this.ctScan = ctScan;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getAssistant() {
        return assistant;
    }

    public void setAssistant(UserAccount assistant) {
        this.assistant = assistant;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

    public String getKnownIssues() {
        return knownIssues;
    }

    public void setKnownIssues(String knownIssues) {
        this.knownIssues = knownIssues;
    }
    
    public String getParentDetails() {
        return parentDetails;
    }

    public void setParentDetails(String parentDetails) {
        this.parentDetails = parentDetails;
    }
    
    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return Ethnicity;
    }

    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    public String getWhenFound() {
        return whenFound;
    }

    public void setWhenFound(String whenFound) {
        this.whenFound = whenFound;
    }

    public String getWhereFound() {
        return whereFound;
    }

    public void setWhereFound(String whereFound) {
        this.whereFound = whereFound;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public String toString() {
        return this.childName;
    }
}

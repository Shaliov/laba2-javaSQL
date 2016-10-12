package laba2.enumeration.SQL;


public interface ConstForSQL {
    public static final String INSERT_NEW_COURSE = "INSERT INTO Course (courseName,courseType,courseTrainingDays,courseNumberOfGroup,pricePrice,pricePriceNDS ) VALUES(?,?,?,?,?,?)";
    public static final String INSERT_NEW_ORGANISATION = "INSERT INTO Organisation (orgName, orgAddres, orgPhone, orgMail) VALUES(?,?,?,?)";

    public static final String RENAME_COURSE  = "UPDATE Course SET courseName = ?,courseType = ?,courseTrainingDays = ?,courseNumberOfGroup = ?,pricePrice = ?, pricePriceNDS = ? WHERE courseId = ?";
    public static final String RENAME_ORGANISATION  = "UPDATE Organisation SET orgName = ?,orgAddres = ?,orgPhone = ?,orgMail = ? WHERE orgId = ?";

    public static final String SELECT_ALL_FROM_COURSE  = "SELECT * FROM Course";
    public static final String SELECT_ALL_FROM_ORGANISATION  = "SELECT * FROM Organisation";

    public static final String DELETE_FROM_COURSE  = "DELETE LOW_PRIORITY FROM Course WHERE courseID = ?";
    public static final String DELETE_FROM_ORGANISATION  = "DELETE LOW_PRIORITY FROM Organisation WHERE orgID = ?";



}

package laba2.enumeration.SQL;


public interface ConstForSQL {
    public static final String INSERT_NEW_COURSE = "INSERT INTO Course (courseName,courseType,courseTrainingDays,courseNumberOfGroup,pricePrice,pricePriceNDS ) VALUES(?,?,?,?,?,?)";
    public static final String INSERT_NEW_ORGANISATION = "INSERT INTO Organisation (orgName, orgAddres, orgPhone, orgMail) VALUES(?,?,?,?)";
    public static final String INSERT_NEW_PRICE = "INSERT INTO Price (priceData, pricePrice, pricePriceNDS) VALUES(?,?,?)";
    public static final String INSERT_NEW_TEACHER = "INSERT INTO Teacher (teacherFIO, teacherDateOfBirthd, teacherSex, teacherEducation, teacherType) VALUES(?,?,?,?,?)";
    public static final String INSERT_NEW_DOCUMENT = "INSERT INTO Document (courseID, teacherID, startTrainingData, courseTrainingDays) VALUES(?,?,?,?)";

    public static final String RENAME_COURSE  = "UPDATE Course SET courseName = ?,courseType = ?,courseTrainingDays = ?,courseNumberOfGroup = ?,pricePrice = ?, pricePriceNDS = ? WHERE courseId = ?";
    public static final String RENAME_ORGANISATION  = "UPDATE Organisation SET orgName = ?,orgAddres = ?,orgPhone = ?,orgMail = ? WHERE orgId = ?";
    public static final String RENAME_PRICE  = "UPDATE Price SET priceData = ?,pricePrice = ?,pricePriceNDS = ? WHERE priceID = ?";
    public static final String RENAME_TEACHER  = "UPDATE Teacher SET teacherFIO = ?,teacherDateOfBirthd = ?,teacherSex = ?, teacherEducation = ?, teacherType = ?  WHERE teacherID = ?";
    public static final String RENAME_DOCUMENT  = "UPDATE Document SET courseID = ?, teacherID = ?,startTrainingData = ?, courseTrainingDays = ?  WHERE id = ?";

    public static final String SELECT_ALL_FROM_COURSE  = "SELECT * FROM Course";
    public static final String SELECT_ALL_FROM_ORGANISATION  = "SELECT * FROM Organisation";
    public static final String SELECT_ALL_FROM_PRICE  = "SELECT * FROM Price";
    public static final String SELECT_ALL_FROM_TEACHER  = "SELECT * FROM Teacher";
    public static final String SELECT_ALL_FROM_DOCUMENT  = "SELECT * FROM Document";

    public static final String DELETE_FROM_COURSE  = "DELETE LOW_PRIORITY FROM Course WHERE courseID = ?";
    public static final String DELETE_FROM_ORGANISATION  = "DELETE LOW_PRIORITY FROM Organisation WHERE orgID = ?";
    public static final String DELETE_FROM_PRICE  = "DELETE LOW_PRIORITY FROM Price WHERE priceID = ?";
    public static final String DELETE_FROM_TEACER = "DELETE LOW_PRIORITY FROM Teacher WHERE teacherID = ?";
    public static final String DELETE_FROM_DOCUMENT = "DELETE LOW_PRIORITY FROM Document WHERE id = ?";

}

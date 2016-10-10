package laba2.enumeration.SQL;


public interface ConstForCourse {
    public static final String INSERT_NEW_COURSE = "INSERT INTO Course (courseName,courseType,courseTrainingDays,courseNumberOfGroup,pricePrice,pricePriceNDS ) VALUES(?,?,?,?,?,?)";

    public static final String RENAME_COURSE  = "UPDATE Course SET courseName = ?,courseType = ?,courseTrainingDays = ?,courseNumberOfGroup = ?,pricePrice = ?, pricePriceNDS = ? WHERE courseId = ?";
    public static final String SELECT_ALL_FROM_COURSE  = "SELECT * FROM Course";
    public static final String DELETE_FROM_COURSE  = "DELETE LOW_PRIORITY FROM Course WHERE courseID = ?";



}

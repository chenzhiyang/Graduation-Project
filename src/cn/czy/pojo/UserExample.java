package cn.czy.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIsteacherIsNull() {
            addCriterion("isTeacher is null");
            return (Criteria) this;
        }

        public Criteria andIsteacherIsNotNull() {
            addCriterion("isTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andIsteacherEqualTo(Byte value) {
            addCriterion("isTeacher =", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherNotEqualTo(Byte value) {
            addCriterion("isTeacher <>", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherGreaterThan(Byte value) {
            addCriterion("isTeacher >", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherGreaterThanOrEqualTo(Byte value) {
            addCriterion("isTeacher >=", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherLessThan(Byte value) {
            addCriterion("isTeacher <", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherLessThanOrEqualTo(Byte value) {
            addCriterion("isTeacher <=", value, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherIn(List<Byte> values) {
            addCriterion("isTeacher in", values, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherNotIn(List<Byte> values) {
            addCriterion("isTeacher not in", values, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherBetween(Byte value1, Byte value2) {
            addCriterion("isTeacher between", value1, value2, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsteacherNotBetween(Byte value1, Byte value2) {
            addCriterion("isTeacher not between", value1, value2, "isteacher");
            return (Criteria) this;
        }

        public Criteria andIsstudentIsNull() {
            addCriterion("isStudent is null");
            return (Criteria) this;
        }

        public Criteria andIsstudentIsNotNull() {
            addCriterion("isStudent is not null");
            return (Criteria) this;
        }

        public Criteria andIsstudentEqualTo(Byte value) {
            addCriterion("isStudent =", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotEqualTo(Byte value) {
            addCriterion("isStudent <>", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentGreaterThan(Byte value) {
            addCriterion("isStudent >", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentGreaterThanOrEqualTo(Byte value) {
            addCriterion("isStudent >=", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentLessThan(Byte value) {
            addCriterion("isStudent <", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentLessThanOrEqualTo(Byte value) {
            addCriterion("isStudent <=", value, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentIn(List<Byte> values) {
            addCriterion("isStudent in", values, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotIn(List<Byte> values) {
            addCriterion("isStudent not in", values, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentBetween(Byte value1, Byte value2) {
            addCriterion("isStudent between", value1, value2, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsstudentNotBetween(Byte value1, Byte value2) {
            addCriterion("isStudent not between", value1, value2, "isstudent");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("isAdmin is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("isAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Byte value) {
            addCriterion("isAdmin =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Byte value) {
            addCriterion("isAdmin <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Byte value) {
            addCriterion("isAdmin >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Byte value) {
            addCriterion("isAdmin >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Byte value) {
            addCriterion("isAdmin <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Byte value) {
            addCriterion("isAdmin <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Byte> values) {
            addCriterion("isAdmin in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Byte> values) {
            addCriterion("isAdmin not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Byte value1, Byte value2) {
            addCriterion("isAdmin between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Byte value1, Byte value2) {
            addCriterion("isAdmin not between", value1, value2, "isadmin");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
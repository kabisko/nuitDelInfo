package news;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-05T00:47:41")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, Date> date;
    public static volatile SingularAttribute<News, String> titre;
    public static volatile SingularAttribute<News, Integer> id;
    public static volatile SingularAttribute<News, String> content;

}
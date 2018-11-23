package kz.shuh.Service;

import kz.shuh.Model.Text;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Shuhratjan Nizamov
 */
@Mapper
public interface TextMyBatisRepository {
    @Select("select * from text")
    List<Text> findAll();

    @Select("SELECT * FROM text WHERE id = #{id}")
    Text findById(int id);

    @Delete("DELETE FROM text WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO text(id, text) VALUES (#{id}, #{text})")
    int insert(Text mobile);

    @Update("Update text set text=#{text} where id=#{id}")
    int update(Text mobile);

}

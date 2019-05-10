package david.com.redditapp.Comments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by David on 5/2/2019.
 */

public class CheckComment {

    @SerializedName("success")
    @Expose
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "CheckComment{" +
                "success='" + success + '\'' +
                '}';
    }
}

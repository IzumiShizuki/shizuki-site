package d7;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5506a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f5506a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

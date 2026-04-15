package ef;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f6576a;

    public l(Pattern pattern) {
        this.f6576a = pattern;
    }

    public static j a(l lVar, String str) {
        lVar.getClass();
        jc.l.e(str, "input");
        Matcher matcher = lVar.f6576a.matcher(str);
        jc.l.d(matcher, "matcher(...)");
        return f0.e(matcher, 0, str);
    }

    public final j b(int i10, String str) {
        jc.l.e(str, "input");
        Matcher matcherRegion = this.f6576a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            return new j(matcherRegion, str);
        }
        return null;
    }

    public final j c(CharSequence charSequence) {
        jc.l.e(charSequence, "input");
        Matcher matcher = this.f6576a.matcher(charSequence);
        jc.l.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        jc.l.e(charSequence, "input");
        return this.f6576a.matcher(charSequence).matches();
    }

    public final String e(String str, String str2) {
        jc.l.e(str, "input");
        String strReplaceAll = this.f6576a.matcher(str).replaceAll(str2);
        jc.l.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f6576a.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public l(String str) {
        jc.l.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        jc.l.d(patternCompile, "compile(...)");
        this.f6576a = patternCompile;
    }

    public l(int i10, String str) {
        jc.l.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str, 66);
        jc.l.d(patternCompile, "compile(...)");
        this.f6576a = patternCompile;
    }
}

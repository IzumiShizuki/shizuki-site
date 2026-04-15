package p3;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n7.e f16532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Paint f16533b;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            a.a.t(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            p3.k r0 = new p3.k
            r0.<init>()
            p3.e.f16532a = r0
            goto L57
        L13:
            r1 = 29
            if (r0 < r1) goto L1f
            p3.j r0 = new p3.j
            r0.<init>()
            p3.e.f16532a = r0
            goto L57
        L1f:
            r1 = 28
            if (r0 < r1) goto L2b
            p3.i r0 = new p3.i
            r0.<init>()
            p3.e.f16532a = r0
            goto L57
        L2b:
            r1 = 26
            if (r0 < r1) goto L37
            p3.h r0 = new p3.h
            r0.<init>()
            p3.e.f16532a = r0
            goto L57
        L37:
            r1 = 24
            if (r0 < r1) goto L50
            java.lang.reflect.Method r0 = p3.g.f16536q
            if (r0 != 0) goto L46
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L46:
            if (r0 == 0) goto L50
            p3.g r0 = new p3.g
            r0.<init>()
            p3.e.f16532a = r0
            goto L57
        L50:
            p3.f r0 = new p3.f
            r0.<init>()
            p3.e.f16532a = r0
        L57:
            i4.d r0 = new i4.d
            r1 = 2
            r0.<init>(r1)
            r0 = 0
            p3.e.f16533b = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.e.<clinit>():void");
    }

    public static Font a(Typeface typeface) {
        if (f16533b == null) {
            f16533b = new Paint();
        }
        f16533b.setTextSize(10.0f);
        f16533b.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f16533b);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}

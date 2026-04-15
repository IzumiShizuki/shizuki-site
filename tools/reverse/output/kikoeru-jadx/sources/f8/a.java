package f8;

import android.R;
import android.animation.PropertyValuesHolder;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6839a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6840b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6841c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6842d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6843e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f6844f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f6845g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f6846h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f6847i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f6848j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f6849k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03aa, code lost:
    
        if (r32 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ac, code lost:
    
        if (r22 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03ae, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03bd, code lost:
    
        if (r3.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03bf, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03cb, code lost:
    
        if (r33 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03cd, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d1, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            p3.d[] dVarArrJ = n7.d.j(string);
            p3.d[] dVarArrJ2 = n7.d.j(string2);
            if (dVarArrJ != null || dVarArrJ2 != null) {
                if (dVarArrJ != null) {
                    f fVar = new f();
                    if (dVarArrJ2 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, dVarArrJ);
                    }
                    if (n7.d.d(dVarArrJ, dVarArrJ2)) {
                        return PropertyValuesHolder.ofObject(str, fVar, dVarArrJ, dVarArrJ2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (dVarArrJ2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), dVarArrJ2);
                }
            }
            return null;
        }
        g gVar = i10 == 3 ? g.f6861a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
        }
        if (propertyValuesHolderOfInt != null && gVar != null) {
            propertyValuesHolderOfInt.setEvaluator(gVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, org.xmlpull.v1.XmlPullParser r25) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}

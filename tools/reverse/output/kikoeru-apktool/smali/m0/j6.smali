.class public final synthetic Lm0/j6;
.super Ljc/j;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic i:Loc/a;

.field public final synthetic j:Ljc/v;

.field public final synthetic k:Ljc/v;


# direct methods
.method public constructor <init>(Loc/a;Ljc/v;Ljc/v;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lm0/j6;->i:Loc/a;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/j6;->j:Ljc/v;

    .line 4
    .line 5
    iput-object p3, p0, Lm0/j6;->k:Ljc/v;

    .line 6
    .line 7
    const-string v4, "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    const-class v2, Ljc/k;

    .line 12
    .line 13
    const-string v3, "scaleToOffset"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Ljc/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lm0/j6;->i:Loc/a;

    .line 8
    .line 9
    iget v1, v0, Loc/a;->a:F

    .line 10
    .line 11
    iget v0, v0, Loc/a;->b:F

    .line 12
    .line 13
    iget-object v2, p0, Lm0/j6;->j:Ljc/v;

    .line 14
    .line 15
    iget v2, v2, Ljc/v;->a:F

    .line 16
    .line 17
    iget-object v3, p0, Lm0/j6;->k:Ljc/v;

    .line 18
    .line 19
    iget v3, v3, Ljc/v;->a:F

    .line 20
    .line 21
    sget v4, Lm0/t6;->a:F

    .line 22
    .line 23
    sub-float/2addr v0, v1

    .line 24
    const/4 v4, 0x0

    .line 25
    cmpg-float v5, v0, v4

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sub-float/2addr p1, v1

    .line 32
    div-float/2addr p1, v0

    .line 33
    :goto_0
    cmpg-float v0, p1, v4

    .line 34
    .line 35
    if-gez v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v4, p1

    .line 39
    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    cmpl-float v0, v4, p1

    .line 42
    .line 43
    if-lez v0, :cond_2

    .line 44
    .line 45
    const/high16 v4, 0x3f800000    # 1.0f

    .line 46
    .line 47
    :cond_2
    invoke-static {v2, v3, v4}, Landroid/support/v4/media/session/b;->L(FFF)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

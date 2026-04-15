.class public final Ll0/n0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# static fields
.field public static final c:Ll0/n0;

.field public static final d:Ll0/n0;

.field public static final e:Ll0/n0;

.field public static final f:Ll0/n0;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll0/n0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ll0/n0;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll0/n0;->c:Ll0/n0;

    .line 9
    .line 10
    new-instance v0, Ll0/n0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Ll0/n0;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ll0/n0;->d:Ll0/n0;

    .line 17
    .line 18
    new-instance v0, Ll0/n0;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Ll0/n0;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ll0/n0;->e:Ll0/n0;

    .line 25
    .line 26
    new-instance v0, Ll0/n0;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Ll0/n0;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ll0/n0;->f:Ll0/n0;

    .line 33
    .line 34
    return-void
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
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Ll0/n0;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ll0/n0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly2/y;

    .line 7
    .line 8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    new-instance p1, Ll0/a1;

    .line 18
    .line 19
    invoke-direct {p1, v0, v1}, Ll0/a1;-><init>(J)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_1
    check-cast p1, Lr/m;

    .line 24
    .line 25
    iget v0, p1, Lr/m;->a:F

    .line 26
    .line 27
    iget p1, p1, Lr/m;->b:F

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    int-to-long v0, v0

    .line 34
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    int-to-long v2, p1

    .line 39
    const/16 p1, 0x20

    .line 40
    .line 41
    shl-long/2addr v0, p1

    .line 42
    const-wide v4, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v2, v4

    .line 48
    or-long/2addr v0, v2

    .line 49
    new-instance p1, Lp1/b;

    .line 50
    .line 51
    invoke-direct {p1, v0, v1}, Lp1/b;-><init>(J)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_2
    check-cast p1, Lp1/b;

    .line 56
    .line 57
    iget-wide v0, p1, Lp1/b;->a:J

    .line 58
    .line 59
    const-wide v2, 0x7fffffff7fffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v2, v0

    .line 65
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long p1, v2, v4

    .line 71
    .line 72
    if-eqz p1, :cond_0

    .line 73
    .line 74
    new-instance p1, Lr/m;

    .line 75
    .line 76
    const/16 v2, 0x20

    .line 77
    .line 78
    shr-long v2, v0, v2

    .line 79
    .line 80
    long-to-int v3, v2

    .line 81
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const-wide v3, 0xffffffffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v0, v3

    .line 91
    long-to-int v1, v0

    .line 92
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-direct {p1, v2, v0}, Lr/m;-><init>(FF)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    sget-object p1, Ll0/p0;->a:Lr/m;

    .line 101
    .line 102
    :goto_0
    return-object p1

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 104
    .line 105
.end method

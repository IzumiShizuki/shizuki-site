.class public final Lsa/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsa/j;


# static fields
.field public static final b:Lsa/i;

.field public static final c:Lsa/i;

.field public static final d:Lsa/i;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsa/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lsa/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lsa/i;->b:Lsa/i;

    .line 8
    .line 9
    new-instance v0, Lsa/i;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lsa/i;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lsa/i;->c:Lsa/i;

    .line 16
    .line 17
    new-instance v0, Lsa/i;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lsa/i;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsa/i;->d:Lsa/i;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsa/i;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final a(F)F
    .locals 4

    .line 1
    iget v0, p0, Lsa/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    float-to-double v0, p1

    .line 7
    const-wide v2, 0x3fa4b5dcc63f1412L    # 0.04045

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmpg-double p1, v0, v2

    .line 13
    .line 14
    if-gtz p1, :cond_0

    .line 15
    .line 16
    const-wide v2, 0x4029d70a3d70a3d7L    # 12.92

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    div-double/2addr v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-wide v2, 0x3fac28f5c28f5c29L    # 0.055

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    add-double/2addr v0, v2

    .line 29
    const-wide v2, 0x3ff0e147ae147ae1L    # 1.055

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    div-double/2addr v0, v2

    .line 35
    const-wide v2, 0x4003333333333333L    # 2.4

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, Lnd/h;->u(DD)D

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    :goto_0
    double-to-float p1, v0

    .line 45
    return p1

    .line 46
    :pswitch_0
    float-to-double v0, p1

    .line 47
    const-wide v2, 0x3f9fff79c842fa51L    # 0.031248

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmpg-double p1, v0, v2

    .line 53
    .line 54
    if-gez p1, :cond_1

    .line 55
    .line 56
    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    .line 57
    .line 58
    div-double/2addr v0, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-wide v2, 0x3ffccccccccccccdL    # 1.8

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1, v2, v3}, Lnd/h;->u(DD)D

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    :goto_1
    double-to-float p1, v0

    .line 70
    :pswitch_1
    return p1

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public b(F)F
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    const-wide v2, 0x3f69a5c37387b719L    # 0.0031308

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    cmpg-double p1, v0, v2

    .line 8
    .line 9
    if-gtz p1, :cond_0

    .line 10
    .line 11
    const-wide v2, 0x4029d70a3d70a3d7L    # 12.92

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    mul-double v0, v0, v2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide v2, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, Lnd/h;->u(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide v2, 0x3ff0e147ae147ae1L    # 1.055

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    mul-double v0, v0, v2

    .line 34
    .line 35
    const-wide v2, 0x3fac28f5c28f5c29L    # 0.055

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    sub-double/2addr v0, v2

    .line 41
    :goto_0
    double-to-float p1, v0

    .line 42
    return p1
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
.end method

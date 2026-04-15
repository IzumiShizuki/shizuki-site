.class public final Lq5/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final i:[F

.field public static final j:[F

.field public static final k:[F


# instance fields
.field public a:I

.field public b:Lce/g;

.field public c:Lh7/k;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lq5/g;->i:[F

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v1, Lq5/g;->j:[F

    .line 16
    .line 17
    new-array v0, v0, [F

    .line 18
    .line 19
    fill-array-data v0, :array_2

    .line 20
    .line 21
    .line 22
    sput-object v0, Lq5/g;->k:[F

    .line 23
    .line 24
    return-void

    .line 25
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 26
    .line 27
    .line 28
    .line 29
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        -0x41000000    # -0.5f
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static b(Lq5/f;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lq5/f;->a:Lq5/e;

    .line 2
    .line 3
    iget-object p0, p0, Lq5/f;->b:Lq5/e;

    .line 4
    .line 5
    iget-object v0, v0, Lq5/e;->a:[Lce/g;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    aget-object v0, v0, v2

    .line 13
    .line 14
    iget v0, v0, Lce/g;->b:I

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lq5/e;->a:[Lce/g;

    .line 19
    .line 20
    array-length v0, p0

    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    aget-object p0, p0, v2

    .line 24
    .line 25
    iget p0, p0, Lce/g;->b:I

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    return v3

    .line 30
    :cond_0
    return v2
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lh7/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lh7/k;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lq5/g;->c:Lh7/k;

    .line 7
    .line 8
    const-string v1, "uMvpMatrix"

    .line 9
    .line 10
    iget v0, v0, Lh7/k;->b:I

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lq5/g;->d:I

    .line 17
    .line 18
    iget-object v0, p0, Lq5/g;->c:Lh7/k;

    .line 19
    .line 20
    const-string v1, "uTexMatrix"

    .line 21
    .line 22
    iget v0, v0, Lh7/k;->b:I

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lq5/g;->e:I

    .line 29
    .line 30
    iget-object v0, p0, Lq5/g;->c:Lh7/k;

    .line 31
    .line 32
    const-string v1, "aPosition"

    .line 33
    .line 34
    iget v0, v0, Lh7/k;->b:I

    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lp4/c;->d()V

    .line 44
    .line 45
    .line 46
    iput v0, p0, Lq5/g;->f:I

    .line 47
    .line 48
    iget-object v0, p0, Lq5/g;->c:Lh7/k;

    .line 49
    .line 50
    const-string v1, "aTexCoords"

    .line 51
    .line 52
    iget v0, v0, Lh7/k;->b:I

    .line 53
    .line 54
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lp4/c;->d()V

    .line 62
    .line 63
    .line 64
    iput v0, p0, Lq5/g;->g:I

    .line 65
    .line 66
    iget-object v0, p0, Lq5/g;->c:Lh7/k;

    .line 67
    .line 68
    const-string v1, "uTexture"

    .line 69
    .line 70
    iget v0, v0, Lh7/k;->b:I

    .line 71
    .line 72
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iput v0, p0, Lq5/g;->h:I
    :try_end_0
    .catch Lp4/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    move-exception v0

    .line 80
    const-string v1, "ProjectionRenderer"

    .line 81
    .line 82
    const-string v2, "Failed to initialize the program"

    .line 83
    .line 84
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 85
    .line 86
    .line 87
    return-void
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

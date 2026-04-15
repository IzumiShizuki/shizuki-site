.class public final Lph/m;
.super Lph/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final e:Lth/k;


# instance fields
.field public b:Lch/z;

.field public c:I

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lth/k;

    .line 2
    .line 3
    new-instance v1, Lr/y1;

    .line 4
    .line 5
    sget-object v2, Lth/k;->f:[I

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lr/y1;-><init>([I)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lr/y1;

    .line 11
    .line 12
    sget-object v2, Lth/k;->g:[I

    .line 13
    .line 14
    invoke-direct {v3, v2}, Lr/y1;-><init>([I)V

    .line 15
    .line 16
    .line 17
    sget-object v4, Lth/k;->h:[I

    .line 18
    .line 19
    sget-object v5, Loh/a;->u:Ljava/lang/String;

    .line 20
    .line 21
    const/16 v2, 0x10

    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lh1/d0;-><init>(Lr/y1;ILr/y1;[ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lph/m;->e:Lth/k;

    .line 27
    .line 28
    return-void
    .line 29
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Loh/a;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b()F
    .locals 3

    .line 1
    iget v0, p0, Lph/m;->d:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const v2, 0x3f7d70a4    # 0.99f

    .line 5
    .line 6
    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget v1, p0, Lph/m;->d:I

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    mul-float v2, v2, v1

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 22
    .line 23
    sub-float/2addr v0, v2

    .line 24
    return v0

    .line 25
    :cond_1
    return v2
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c([BI)I
    .locals 5

    .line 1
    iget-object v0, p0, Lph/m;->b:Lch/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    if-ge v1, p2, :cond_3

    .line 7
    .line 8
    aget-byte v4, p1, v1

    .line 9
    .line 10
    invoke-virtual {v0, v4}, Lch/z;->r(B)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-ne v4, v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    iput p1, p0, Lph/m;->c:I

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    if-ne v4, v2, :cond_1

    .line 21
    .line 22
    iput v2, p0, Lph/m;->c:I

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    if-nez v4, :cond_2

    .line 26
    .line 27
    iget v4, v0, Lch/z;->b:I

    .line 28
    .line 29
    if-lt v4, v2, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lph/m;->d:I

    .line 32
    .line 33
    add-int/2addr v2, v3

    .line 34
    iput v2, p0, Lph/m;->d:I

    .line 35
    .line 36
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    :goto_1
    iget p1, p0, Lph/m;->c:I

    .line 40
    .line 41
    if-ne p1, v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Lph/m;->b()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const p2, 0x3f733333    # 0.95f

    .line 48
    .line 49
    .line 50
    cmpl-float p1, p1, p2

    .line 51
    .line 52
    if-lez p1, :cond_4

    .line 53
    .line 54
    iput v2, p0, Lph/m;->c:I

    .line 55
    .line 56
    :cond_4
    iget p1, p0, Lph/m;->c:I

    .line 57
    .line 58
    return p1
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lph/m;->b:Lch/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lch/z;->a:I

    .line 5
    .line 6
    iput v1, p0, Lph/m;->d:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lph/m;->c:I

    .line 10
    .line 11
    return-void
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
.end method

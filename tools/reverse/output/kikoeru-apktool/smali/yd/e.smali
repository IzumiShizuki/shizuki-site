.class public final Lyd/e;
.super Lyd/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Lyd/e;

.field public static final h:Lyd/e;


# instance fields
.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyd/e;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    filled-new-array {v1, v1, v2}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-direct {v0, v3, v2}, Lyd/e;-><init>([IZ)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lyd/e;->g:Lyd/e;

    .line 13
    .line 14
    iget v3, v0, Lyd/a;->c:I

    .line 15
    .line 16
    iget v0, v0, Lyd/a;->b:I

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0x9

    .line 22
    .line 23
    if-ne v3, v5, :cond_0

    .line 24
    .line 25
    new-instance v0, Lyd/e;

    .line 26
    .line 27
    filled-new-array {v1, v2, v2}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v1, v2}, Lyd/e;-><init>([IZ)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v1, Lyd/e;

    .line 36
    .line 37
    add-int/2addr v3, v4

    .line 38
    filled-new-array {v0, v3, v2}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v1, v0, v2}, Lyd/e;-><init>([IZ)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :goto_0
    sput-object v0, Lyd/e;->h:Lyd/e;

    .line 47
    .line 48
    new-instance v0, Lyd/e;

    .line 49
    .line 50
    new-array v1, v2, [I

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lyd/e;-><init>([IZ)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public constructor <init>([IZ)V
    .locals 1

    .line 1
    const-string v0, "versionArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lyd/a;-><init>([I)V

    .line 12
    .line 13
    .line 14
    iput-boolean p2, p0, Lyd/e;->f:Z

    .line 15
    .line 16
    return-void
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
.method public final b(Lyd/e;)Z
    .locals 5

    .line 1
    const-string v0, "metadataVersionFromLanguageVersion"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lyd/e;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lyd/e;->g:Lyd/e;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lyd/e;->h:Lyd/e;

    .line 14
    .line 15
    :goto_0
    iget v1, v0, Lyd/a;->b:I

    .line 16
    .line 17
    iget v2, p1, Lyd/a;->b:I

    .line 18
    .line 19
    if-le v1, v2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    iget v1, v0, Lyd/a;->c:I

    .line 26
    .line 27
    iget v2, p1, Lyd/a;->c:I

    .line 28
    .line 29
    if-le v1, v2, :cond_3

    .line 30
    .line 31
    :goto_1
    move-object p1, v0

    .line 32
    :cond_3
    :goto_2
    iget v0, p0, Lyd/a;->c:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    const/4 v2, 0x0

    .line 36
    iget v3, p0, Lyd/a;->b:I

    .line 37
    .line 38
    if-ne v3, v1, :cond_4

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_4
    if-nez v3, :cond_5

    .line 44
    .line 45
    :goto_3
    return v2

    .line 46
    :cond_5
    iget v4, p1, Lyd/a;->b:I

    .line 47
    .line 48
    if-le v3, v4, :cond_6

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_6
    if-ge v3, v4, :cond_7

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_7
    iget p1, p1, Lyd/a;->c:I

    .line 55
    .line 56
    if-le v0, p1, :cond_8

    .line 57
    .line 58
    :goto_4
    const/4 v2, 0x1

    .line 59
    :cond_8
    :goto_5
    xor-int/lit8 p1, v2, 0x1

    .line 60
    .line 61
    return p1
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

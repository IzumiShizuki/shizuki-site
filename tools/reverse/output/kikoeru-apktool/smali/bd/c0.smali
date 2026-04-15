.class public final Lbd/c0;
.super Lbd/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lyc/h0;


# static fields
.field public static final synthetic h:[Lpc/u;


# instance fields
.field public final c:Lbd/h0;

.field public final d:Lbe/c;

.field public final e:Lre/i;

.field public final f:Lre/i;

.field public final g:Lle/k;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Lbd/c0;

    .line 4
    .line 5
    const-string v2, "fragments"

    .line 6
    .line 7
    const-string v3, "getFragments()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "empty"

    .line 20
    .line 21
    const-string v5, "getEmpty()Z"

    .line 22
    .line 23
    invoke-static {v1, v3, v5, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [Lpc/u;

    .line 29
    .line 30
    aput-object v0, v2, v4

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v2, v0

    .line 34
    .line 35
    sput-object v2, Lbd/c0;->h:[Lpc/u;

    .line 36
    .line 37
    return-void
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

.method public constructor <init>(Lbd/h0;Lbe/c;Lre/l;)V
    .locals 2

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "storageManager"

    .line 7
    .line 8
    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p2, Lbe/c;->a:Lbe/d;

    .line 12
    .line 13
    invoke-virtual {v0}, Lbe/d;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v0, Lbe/d;->e:Lbe/e;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lbe/d;->g()Lbe/e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    sget-object v1, Lzc/g;->a:Lzc/f;

    .line 27
    .line 28
    invoke-direct {p0, v1, v0}, Lbd/p;-><init>(Lzc/h;Lbe/e;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lbd/c0;->c:Lbd/h0;

    .line 32
    .line 33
    iput-object p2, p0, Lbd/c0;->d:Lbe/c;

    .line 34
    .line 35
    new-instance p1, Lbd/b0;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-direct {p1, p0, p2}, Lbd/b0;-><init>(Lbd/c0;I)V

    .line 39
    .line 40
    .line 41
    new-instance p2, Lre/i;

    .line 42
    .line 43
    invoke-direct {p2, p3, p1}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Lbd/c0;->e:Lre/i;

    .line 47
    .line 48
    new-instance p1, Lbd/b0;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-direct {p1, p0, p2}, Lbd/b0;-><init>(Lbd/c0;I)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lre/i;

    .line 55
    .line 56
    invoke-direct {p2, p3, p1}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 57
    .line 58
    .line 59
    iput-object p2, p0, Lbd/c0;->f:Lre/i;

    .line 60
    .line 61
    new-instance p1, Lle/k;

    .line 62
    .line 63
    new-instance p2, Lbd/b0;

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    invoke-direct {p2, p0, v0}, Lbd/b0;-><init>(Lbd/c0;I)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p3, p2}, Lle/k;-><init>(Lre/o;Lic/a;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lbd/c0;->g:Lle/k;

    .line 73
    .line 74
    return-void
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
.method public final a0(Lyc/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lyc/m;->j(Lbd/c0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lyc/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyc/h0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    check-cast p1, Lbd/c0;

    .line 14
    .line 15
    iget-object v1, p1, Lbd/c0;->d:Lbe/c;

    .line 16
    .line 17
    iget-object v2, p0, Lbd/c0;->d:Lbe/c;

    .line 18
    .line 19
    invoke-static {v2, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lbd/c0;->c:Lbd/h0;

    .line 26
    .line 27
    iget-object p1, p1, Lbd/c0;->c:Lbd/h0;

    .line 28
    .line 29
    invoke-static {v1, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    return v0
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
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbd/c0;->c:Lbd/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lbd/c0;->d:Lbe/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lbe/c;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
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

.method public final y()Lyc/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lbd/c0;->d:Lbe/c;

    .line 2
    .line 3
    iget-object v1, v0, Lbe/c;->a:Lbe/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Lbe/d;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v1, p0, Lbd/c0;->c:Lbd/h0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lbe/c;->b()Lbe/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lbd/h0;->K0(Lbe/c;)Lyc/h0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

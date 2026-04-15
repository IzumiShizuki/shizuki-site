.class public final Ls/k1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:Ls/l1;

.field public final synthetic c:I

.field public final synthetic d:Lg2/g1;


# direct methods
.method public constructor <init>(Ls/l1;ILg2/g1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls/k1;->b:Ls/l1;

    .line 2
    .line 3
    iput p2, p0, Ls/k1;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Ls/k1;->d:Lg2/g1;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
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
    .locals 4

    .line 1
    check-cast p1, Lg2/f1;

    .line 2
    .line 3
    iget-object v0, p0, Ls/k1;->b:Ls/l1;

    .line 4
    .line 5
    iget-object v1, v0, Ls/l1;->o:Ls/o1;

    .line 6
    .line 7
    iget-object v1, v1, Ls/o1;->a:Lx0/b1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lx0/b1;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-gez v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :cond_0
    iget v3, p0, Ls/k1;->c:I

    .line 18
    .line 19
    if-le v1, v3, :cond_1

    .line 20
    .line 21
    move v1, v3

    .line 22
    :cond_1
    neg-int v1, v1

    .line 23
    iget-boolean v0, v0, Ls/l1;->p:Z

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v3, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const/4 v1, 0x0

    .line 34
    :goto_1
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p1, Lg2/f1;->a:Z

    .line 36
    .line 37
    iget-object v0, p0, Ls/k1;->d:Lg2/g1;

    .line 38
    .line 39
    invoke-static {p1, v0, v3, v1}, Lg2/f1;->l(Lg2/f1;Lg2/g1;II)V

    .line 40
    .line 41
    .line 42
    iput-boolean v2, p1, Lg2/f1;->a:Z

    .line 43
    .line 44
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 45
    .line 46
    return-object p1
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

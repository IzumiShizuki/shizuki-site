.class public final Lv0/j0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public synthetic e:J

.field public final synthetic f:Lv0/l0;


# direct methods
.method public constructor <init>(Lv0/l0;Lyb/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv0/j0;->f:Lv0/l0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lu/i1;

    .line 2
    .line 3
    check-cast p2, Lp1/b;

    .line 4
    .line 5
    iget-wide p1, p2, Lp1/b;->a:J

    .line 6
    .line 7
    check-cast p3, Lyb/c;

    .line 8
    .line 9
    new-instance v0, Lv0/j0;

    .line 10
    .line 11
    iget-object v1, p0, Lv0/j0;->f:Lv0/l0;

    .line 12
    .line 13
    invoke-direct {v0, v1, p3}, Lv0/j0;-><init>(Lv0/l0;Lyb/c;)V

    .line 14
    .line 15
    .line 16
    iput-wide p1, v0, Lv0/j0;->e:J

    .line 17
    .line 18
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lv0/j0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lv0/j0;->e:J

    .line 5
    .line 6
    iget-object p1, p0, Lv0/j0;->f:Lv0/l0;

    .line 7
    .line 8
    iget-boolean v2, p1, Lv0/l0;->g:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p1, Lv0/l0;->f:Lx0/b1;

    .line 13
    .line 14
    invoke-virtual {v2}, Lx0/b1;->e()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    invoke-static {v0, v1}, Lp1/b;->e(J)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-float/2addr v2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0, v1}, Lp1/b;->e(J)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :goto_0
    iget-object v0, p1, Lv0/l0;->k:Lx0/a1;

    .line 30
    .line 31
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sub-float/2addr v2, v0

    .line 36
    iget-object p1, p1, Lv0/l0;->l:Lx0/a1;

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Lx0/a1;->f(F)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 42
    .line 43
    return-object p1
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

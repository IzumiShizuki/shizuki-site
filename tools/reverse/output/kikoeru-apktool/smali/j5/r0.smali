.class public final Lj5/r0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lj5/c1;


# instance fields
.field public final a:I

.field public final synthetic b:Lj5/t0;


# direct methods
.method public constructor <init>(Lj5/t0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj5/r0;->b:Lj5/t0;

    .line 5
    .line 6
    iput p2, p0, Lj5/r0;->a:I

    .line 7
    .line 8
    return-void
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
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj5/r0;->b:Lj5/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/t0;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lj5/t0;->u:[Lj5/b1;

    .line 10
    .line 11
    iget v2, p0, Lj5/r0;->a:I

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    iget-boolean v0, v0, Lj5/t0;->O:Z

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lj5/b1;->x(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
    .line 27
    .line 28
    .line 29
.end method

.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Lj5/r0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lj5/r0;->b:Lj5/t0;

    .line 4
    .line 5
    iget-object v2, v1, Lj5/t0;->u:[Lj5/b1;

    .line 6
    .line 7
    aget-object v0, v2, v0

    .line 8
    .line 9
    invoke-virtual {v0}, Lj5/b1;->z()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Lj5/t0;->m:Ln5/o;

    .line 13
    .line 14
    iget-object v2, v1, Lj5/t0;->d:Lm3/l;

    .line 15
    .line 16
    iget v1, v1, Lj5/t0;->E:I

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lm3/l;->u(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, v0, Ln5/o;->c:Ljava/io/IOException;

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    iget-object v0, v0, Ln5/o;->b:Ln5/k;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/high16 v2, -0x80000000

    .line 31
    .line 32
    if-ne v1, v2, :cond_0

    .line 33
    .line 34
    iget v1, v0, Ln5/k;->a:I

    .line 35
    .line 36
    :cond_0
    iget-object v2, v0, Ln5/k;->e:Ljava/io/IOException;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget v0, v0, Ln5/k;->f:I

    .line 41
    .line 42
    if-gt v0, v1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    throw v2

    .line 46
    :cond_2
    :goto_0
    return-void

    .line 47
    :cond_3
    throw v2
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

.method public final j(J)I
    .locals 4

    .line 1
    iget-object v0, p0, Lj5/r0;->b:Lj5/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/t0;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iget v1, p0, Lj5/r0;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lj5/t0;->B(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lj5/t0;->u:[Lj5/b1;

    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    iget-boolean v3, v0, Lj5/t0;->O:Z

    .line 21
    .line 22
    invoke-virtual {v2, p1, p2, v3}, Lj5/b1;->v(JZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v2, p1}, Lj5/b1;->H(I)V

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lj5/t0;->C(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return p1
    .line 35
    .line 36
.end method

.method public final n(Lv2/e;Lu4/f;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lj5/r0;->b:Lj5/t0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/t0;->G()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x3

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget v1, p0, Lj5/r0;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lj5/t0;->B(I)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lj5/t0;->u:[Lj5/b1;

    .line 17
    .line 18
    aget-object v3, v3, v1

    .line 19
    .line 20
    iget-boolean v4, v0, Lj5/t0;->O:Z

    .line 21
    .line 22
    invoke-virtual {v3, p1, p2, p3, v4}, Lj5/b1;->C(Lv2/e;Lu4/f;IZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lj5/t0;->C(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return p1
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

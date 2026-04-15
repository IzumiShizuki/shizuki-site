.class public final Lu/r1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb2/a;


# instance fields
.field public final a:Lu/c2;

.field public b:Z


# direct methods
.method public constructor <init>(Lu/c2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/r1;->a:Lu/c2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lu/r1;->b:Z

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
.method public final D(JJLyb/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p1, p5, Lu/q1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Lu/q1;

    .line 7
    .line 8
    iget p2, p1, Lu/q1;->g:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Lu/q1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lu/q1;

    .line 21
    .line 22
    check-cast p5, Lac/c;

    .line 23
    .line 24
    invoke-direct {p1, p0, p5}, Lu/q1;-><init>(Lu/r1;Lac/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, p1, Lu/q1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iget p5, p1, Lu/q1;->g:I

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-eqz p5, :cond_3

    .line 33
    .line 34
    if-eq p5, v0, :cond_2

    .line 35
    .line 36
    const/4 p3, 0x2

    .line 37
    if-ne p5, p3, :cond_1

    .line 38
    .line 39
    iget-wide p3, p1, Lu/q1;->d:J

    .line 40
    .line 41
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p2, Lf3/q;

    .line 45
    .line 46
    iget-wide p1, p2, Lf3/q;->a:J

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-wide p3, p1, Lu/q1;->d:J

    .line 58
    .line 59
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean p2, p0, Lu/r1;->b:Z

    .line 67
    .line 68
    const-wide/16 v1, 0x0

    .line 69
    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    iget-object p2, p0, Lu/r1;->a:Lu/c2;

    .line 73
    .line 74
    iget-boolean p5, p2, Lu/c2;->h:Z

    .line 75
    .line 76
    if-eqz p5, :cond_4

    .line 77
    .line 78
    move-wide p1, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    iput-wide p3, p1, Lu/q1;->d:J

    .line 81
    .line 82
    iput v0, p1, Lu/q1;->g:I

    .line 83
    .line 84
    invoke-virtual {p2, p3, p4, p1}, Lu/c2;->b(JLac/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 89
    .line 90
    if-ne p2, p1, :cond_5

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_5
    :goto_1
    check-cast p2, Lf3/q;

    .line 94
    .line 95
    iget-wide p1, p2, Lf3/q;->a:J

    .line 96
    .line 97
    :goto_2
    invoke-static {p3, p4, p1, p2}, Lf3/q;->d(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    :cond_6
    new-instance p1, Lf3/q;

    .line 102
    .line 103
    invoke-direct {p1, v1, v2}, Lf3/q;-><init>(J)V

    .line 104
    .line 105
    .line 106
    return-object p1
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final synthetic F(IJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
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

.method public final V(JLyb/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lf3/q;

    .line 2
    .line 3
    const-wide/16 p2, 0x0

    .line 4
    .line 5
    invoke-direct {p1, p2, p3}, Lf3/q;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final X(IJJ)J
    .locals 0

    .line 1
    iget-boolean p1, p0, Lu/r1;->b:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lu/r1;->a:Lu/c2;

    .line 6
    .line 7
    iget-object p2, p1, Lu/c2;->a:Lu/v1;

    .line 8
    .line 9
    invoke-interface {p2}, Lu/v1;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p1, Lu/c2;->a:Lu/v1;

    .line 17
    .line 18
    invoke-virtual {p1, p4, p5}, Lu/c2;->g(J)F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1, p3}, Lu/c2;->d(F)F

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-interface {p2, p3}, Lu/v1;->e(F)F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p1, p2}, Lu/c2;->d(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p1, p2}, Lu/c2;->h(F)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1

    .line 39
    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    .line 40
    .line 41
    return-wide p1
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

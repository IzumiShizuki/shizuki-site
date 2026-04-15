.class public final Lm9/c;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic h:[Lpc/u;


# instance fields
.field public final b:Lfg/f;

.field public final c:Lhg/b;

.field public final d:Lhg/b;

.field public final e:Lhg/b;

.field public final f:Lhg/b;

.field public final g:Lx0/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljc/o;

    .line 2
    .line 3
    const-class v1, Lm9/c;

    .line 4
    .line 5
    const-string v2, "username"

    .line 6
    .line 7
    const-string v3, "getUsername()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/o;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->e(Ljc/o;)Lpc/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "password"

    .line 20
    .line 21
    const-string v5, "getPassword()Ljava/lang/String;"

    .line 22
    .line 23
    invoke-static {v1, v3, v5, v4, v2}, Lq/t0;->G(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/k;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "token"

    .line 28
    .line 29
    const-string v6, "getToken()Ljava/lang/String;"

    .line 30
    .line 31
    invoke-static {v1, v5, v6, v4, v2}, Lq/t0;->G(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/k;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "recommenderUuid"

    .line 36
    .line 37
    const-string v7, "getRecommenderUuid()Ljava/lang/String;"

    .line 38
    .line 39
    invoke-static {v1, v6, v7, v4, v2}, Lq/t0;->G(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/k;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x4

    .line 44
    new-array v2, v2, [Lpc/u;

    .line 45
    .line 46
    aput-object v0, v2, v4

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    aput-object v3, v2, v0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    aput-object v5, v2, v0

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    aput-object v1, v2, v0

    .line 56
    .line 57
    sput-object v2, Lm9/c;->h:[Lpc/u;

    .line 58
    .line 59
    return-void
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

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lg9/a;->a()Lfg/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lm9/c;->b:Lfg/f;

    .line 9
    .line 10
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "username"

    .line 21
    .line 22
    const-string v4, ""

    .line 23
    .line 24
    invoke-static {v0, v3, v4, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lm9/c;->c:Lhg/b;

    .line 29
    .line 30
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "password"

    .line 39
    .line 40
    invoke-static {v0, v2, v4, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lm9/c;->d:Lhg/b;

    .line 45
    .line 46
    sget-object v0, La9/i;->b:Lub/p;

    .line 47
    .line 48
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lhg/b;

    .line 53
    .line 54
    iput-object v0, p0, Lm9/c;->e:Lhg/b;

    .line 55
    .line 56
    sget-object v0, La9/i;->d:Lub/p;

    .line 57
    .line 58
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lhg/b;

    .line 63
    .line 64
    iput-object v0, p0, Lm9/c;->f:Lhg/b;

    .line 65
    .line 66
    sget-object v0, Lka/q;->a:Lka/q;

    .line 67
    .line 68
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lm9/c;->g:Lx0/e1;

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
.end method


# virtual methods
.method public final w(Ljava/lang/String;Lac/i;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 2
    .line 3
    sget-object v0, Lnf/n;->a:Ljf/d;

    .line 4
    .line 5
    new-instance v1, Llf/w0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x5

    .line 9
    invoke-direct {v1, p0, p1, v2, v3}, Llf/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public final x(Lic/a;Lac/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lm9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm9/b;

    .line 7
    .line 8
    iget v1, v0, Lm9/b;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm9/b;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm9/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm9/b;-><init>(Lm9/c;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm9/b;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm9/b;->f:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p2, Lhf/l0;->a:Lpf/e;

    .line 50
    .line 51
    sget-object p2, Lpf/d;->c:Lpf/d;

    .line 52
    .line 53
    new-instance v1, Landroidx/lifecycle/r;

    .line 54
    .line 55
    const/16 v3, 0x9

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v1, p0, p1, v4, v3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 59
    .line 60
    .line 61
    iput v2, v0, Lm9/b;->f:I

    .line 62
    .line 63
    invoke-static {p2, v1, v0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 68
    .line 69
    if-ne p2, p1, :cond_3

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Lub/n;

    .line 73
    .line 74
    iget-object p1, p2, Lub/n;->a:Ljava/lang/Object;

    .line 75
    .line 76
    return-object p1
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

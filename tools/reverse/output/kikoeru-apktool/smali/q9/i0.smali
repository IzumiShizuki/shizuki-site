.class public final Lq9/i0;
.super Li7/h2;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/4 v2, 0x2

    and-int/2addr p1, v2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, v0, v1, p1}, Lq9/i0;-><init>(ZILjava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(ZILjava/lang/Long;)V
    .locals 1

    const-string v0, "filterBy"

    invoke-static {p2, v0}, Lj2/h0;->q(ILjava/lang/String;)V

    .line 2
    invoke-direct {p0}, Li7/h2;-><init>()V

    .line 3
    iput-boolean p1, p0, Lq9/i0;->b:Z

    .line 4
    iput p2, p0, Lq9/i0;->c:I

    .line 5
    iput-object p3, p0, Lq9/i0;->d:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a(Li7/i2;)Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p1, Li7/i2;->b:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1, v0}, Li7/i2;->a(I)Li7/f2;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Li7/f2;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/2addr p1, v3

    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1, v0}, Li7/i2;->a(I)Li7/f2;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p1, Li7/f2;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/Integer;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    sub-int/2addr p1, v3

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object p1, v1

    .line 56
    :goto_0
    if-eqz p1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ge p1, v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move v3, p1

    .line 66
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_3
    return-object v1
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

.method public final c(Li7/c2;Lac/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lq9/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lq9/h0;

    .line 7
    .line 8
    iget v1, v0, Lq9/h0;->g:I

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
    iput v1, v0, Lq9/h0;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lq9/h0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lq9/h0;-><init>(Lq9/i0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lq9/h0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lq9/h0;->g:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget p1, v0, Lq9/h0;->d:I

    .line 36
    .line 37
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Li7/c2;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/Integer;

    .line 57
    .line 58
    if-eqz p1, :cond_9

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    sget-object p2, Lhf/l0;->a:Lpf/e;

    .line 65
    .line 66
    sget-object p2, Lpf/d;->c:Lpf/d;

    .line 67
    .line 68
    new-instance v1, Lba/v0;

    .line 69
    .line 70
    const/16 v4, 0xc

    .line 71
    .line 72
    invoke-direct {v1, p0, p1, v2, v4}, Lba/v0;-><init>(Li7/h2;ILyb/c;I)V

    .line 73
    .line 74
    .line 75
    iput p1, v0, Lq9/h0;->d:I

    .line 76
    .line 77
    iput v3, v0, Lq9/h0;->g:I

    .line 78
    .line 79
    invoke-static {p2, v1, v0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 84
    .line 85
    if-ne p2, v0, :cond_3

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    :goto_1
    check-cast p2, Lub/n;

    .line 89
    .line 90
    iget-object p2, p2, Lub/n;->a:Ljava/lang/Object;

    .line 91
    .line 92
    instance-of v0, p2, Lub/m;

    .line 93
    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    check-cast p2, Lbg/s;

    .line 97
    .line 98
    iget-object v0, p2, Lbg/s;->a:Lbg/m;

    .line 99
    .line 100
    iget v1, v0, Lbg/m;->b:I

    .line 101
    .line 102
    iget v4, v0, Lbg/m;->a:I

    .line 103
    .line 104
    mul-int v1, v1, v4

    .line 105
    .line 106
    iget v0, v0, Lbg/m;->c:I

    .line 107
    .line 108
    if-ge v1, v0, :cond_4

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    const/4 v0, 0x0

    .line 113
    :goto_2
    new-instance v1, Li7/f2;

    .line 114
    .line 115
    iget-object p2, p2, Lbg/s;->b:Ljava/util/List;

    .line 116
    .line 117
    if-gt p1, v3, :cond_5

    .line 118
    .line 119
    move-object v5, v2

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    add-int/lit8 v4, p1, -0x1

    .line 122
    .line 123
    new-instance v5, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 126
    .line 127
    .line 128
    :goto_3
    if-eqz v0, :cond_6

    .line 129
    .line 130
    add-int/2addr p1, v3

    .line 131
    new-instance v2, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-direct {v1, p2, v5, v2}, Li7/f2;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_7
    invoke-static {p2}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_8

    .line 145
    .line 146
    invoke-static {p1}, Lna/q;->k(Ljava/lang/Throwable;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 150
    .line 151
    .line 152
    new-instance p2, Li7/d2;

    .line 153
    .line 154
    invoke-direct {p2, p1}, Li7/d2;-><init>(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    return-object p2

    .line 158
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 159
    .line 160
    const-string p2, "never happen"

    .line 161
    .line 162
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_9
    new-instance p1, Li7/d2;

    .line 167
    .line 168
    new-instance p2, Ljava/lang/Exception;

    .line 169
    .line 170
    const-string v0, "Key is null"

    .line 171
    .line 172
    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {p1, p2}, Li7/d2;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    return-object p1
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

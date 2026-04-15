.class public final Lf9/d;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public e:Lhf/e0;

.field public f:I

.field public g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    new-instance v0, Lf9/d;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, v0, Lf9/d;->i:Ljava/lang/Object;

    .line 8
    .line 9
    return-object v0
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lhf/y;

    .line 2
    .line 3
    check-cast p2, Lyb/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lf9/d;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lf9/d;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lf9/d;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lf9/d;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhf/y;

    .line 4
    .line 5
    iget v1, p0, Lf9/d;->h:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    if-ne v1, v3, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lf9/d;->g:I

    .line 19
    .line 20
    iget v1, p0, Lf9/d;->f:I

    .line 21
    .line 22
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v0, p0, Lf9/d;->e:Lhf/e0;

    .line 35
    .line 36
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lba/t;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    invoke-direct {p1, v3, v4, v1}, Lba/t;-><init>(ILyb/c;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-static {v0, v4, p1, v1}, Lhf/a0;->f(Lhf/y;Ljf/d;Lic/n;I)Lhf/e0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v6, Lba/t;

    .line 55
    .line 56
    const/4 v7, 0x5

    .line 57
    invoke-direct {v6, v3, v4, v7}, Lba/t;-><init>(ILyb/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v4, v6, v1}, Lhf/a0;->f(Lhf/y;Ljf/d;Lic/n;I)Lhf/e0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v4, p0, Lf9/d;->i:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, p0, Lf9/d;->e:Lhf/e0;

    .line 67
    .line 68
    iput v2, p0, Lf9/d;->h:I

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Lhf/k1;->r(Lac/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v5, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :goto_0
    check-cast p1, Lub/k;

    .line 78
    .line 79
    iget-object v1, p1, Lub/k;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iput-object v4, p0, Lf9/d;->i:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v4, p0, Lf9/d;->e:Lhf/e0;

    .line 98
    .line 99
    iput v1, p0, Lf9/d;->f:I

    .line 100
    .line 101
    iput p1, p0, Lf9/d;->g:I

    .line 102
    .line 103
    iput v3, p0, Lf9/d;->h:I

    .line 104
    .line 105
    invoke-interface {v0, p0}, Lhf/d0;->n(Lac/i;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v5, :cond_4

    .line 110
    .line 111
    :goto_1
    return-object v5

    .line 112
    :cond_4
    move-object v8, v0

    .line 113
    move v0, p1

    .line 114
    move-object p1, v8

    .line 115
    :goto_2
    check-cast p1, Lub/k;

    .line 116
    .line 117
    iget-object v4, p1, Lub/k;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v4, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    add-int/2addr v1, v4

    .line 134
    new-instance v4, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 137
    .line 138
    .line 139
    add-int/2addr v0, p1

    .line 140
    new-instance p1, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 143
    .line 144
    .line 145
    new-array v0, v3, [Ljava/lang/Object;

    .line 146
    .line 147
    const/4 v1, 0x0

    .line 148
    aput-object v4, v0, v1

    .line 149
    .line 150
    aput-object p1, v0, v2

    .line 151
    .line 152
    const p1, 0x7f0c0163

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0}, Lna/q;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const/4 v5, 0x0

    .line 160
    const/16 v6, 0x1ff

    .line 161
    .line 162
    const-wide/16 v2, 0x0

    .line 163
    .line 164
    const/4 v4, 0x0

    .line 165
    invoke-static/range {v1 .. v6}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 169
    .line 170
    return-object p1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.class public final Lf9/c;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public e:Lhf/e0;

.field public f:Lhf/d0;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    new-instance v0, Lf9/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p2}, Lac/i;-><init>(ILyb/c;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, v0, Lf9/c;->l:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lf9/c;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lf9/c;

    .line 10
    .line 11
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lf9/c;->u(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-object v0, p0, Lf9/c;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhf/y;

    .line 4
    .line 5
    iget v1, p0, Lf9/c;->k:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    if-eq v1, v3, :cond_2

    .line 16
    .line 17
    if-eq v1, v4, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget v0, p0, Lf9/c;->j:I

    .line 22
    .line 23
    iget v1, p0, Lf9/c;->i:I

    .line 24
    .line 25
    iget v2, p0, Lf9/c;->h:I

    .line 26
    .line 27
    iget v5, p0, Lf9/c;->g:I

    .line 28
    .line 29
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    iget v0, p0, Lf9/c;->h:I

    .line 43
    .line 44
    iget v1, p0, Lf9/c;->g:I

    .line 45
    .line 46
    iget-object v7, p0, Lf9/c;->f:Lhf/d0;

    .line 47
    .line 48
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object v0, p0, Lf9/c;->f:Lhf/d0;

    .line 53
    .line 54
    iget-object v1, p0, Lf9/c;->e:Lhf/e0;

    .line 55
    .line 56
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    move-object v7, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Lba/t;

    .line 65
    .line 66
    invoke-direct {p1, v4, v5, v3}, Lba/t;-><init>(ILyb/c;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v5, p1, v2}, Lhf/a0;->f(Lhf/y;Ljf/d;Lic/n;I)Lhf/e0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v1, Lba/t;

    .line 74
    .line 75
    invoke-direct {v1, v4, v5, v4}, Lba/t;-><init>(ILyb/c;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v5, v1, v2}, Lhf/a0;->f(Lhf/y;Ljf/d;Lic/n;I)Lhf/e0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v7, Lba/t;

    .line 83
    .line 84
    invoke-direct {v7, v4, v5, v2}, Lba/t;-><init>(ILyb/c;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v5, v7, v2}, Lhf/a0;->f(Lhf/y;Ljf/d;Lic/n;I)Lhf/e0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v5, p0, Lf9/c;->l:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v1, p0, Lf9/c;->e:Lhf/e0;

    .line 94
    .line 95
    iput-object v0, p0, Lf9/c;->f:Lhf/d0;

    .line 96
    .line 97
    iput v3, p0, Lf9/c;->k:I

    .line 98
    .line 99
    invoke-virtual {p1, p0}, Lhf/k1;->r(Lac/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v6, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :goto_0
    check-cast p1, Lub/k;

    .line 107
    .line 108
    iget-object v0, p1, Lub/k;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput-object v5, p0, Lf9/c;->l:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v5, p0, Lf9/c;->e:Lhf/e0;

    .line 127
    .line 128
    iput-object v7, p0, Lf9/c;->f:Lhf/d0;

    .line 129
    .line 130
    iput v0, p0, Lf9/c;->g:I

    .line 131
    .line 132
    iput p1, p0, Lf9/c;->h:I

    .line 133
    .line 134
    iput v4, p0, Lf9/c;->k:I

    .line 135
    .line 136
    invoke-interface {v1, p0}, Lhf/d0;->n(Lac/i;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-ne v1, v6, :cond_5

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    move v9, v0

    .line 144
    move v0, p1

    .line 145
    move-object p1, v1

    .line 146
    move v1, v9

    .line 147
    :goto_1
    check-cast p1, Lub/k;

    .line 148
    .line 149
    iget-object v8, p1, Lub/k;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v8, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    iput-object v5, p0, Lf9/c;->l:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v5, p0, Lf9/c;->e:Lhf/e0;

    .line 168
    .line 169
    iput-object v5, p0, Lf9/c;->f:Lhf/d0;

    .line 170
    .line 171
    iput v1, p0, Lf9/c;->g:I

    .line 172
    .line 173
    iput v0, p0, Lf9/c;->h:I

    .line 174
    .line 175
    iput v8, p0, Lf9/c;->i:I

    .line 176
    .line 177
    iput p1, p0, Lf9/c;->j:I

    .line 178
    .line 179
    iput v2, p0, Lf9/c;->k:I

    .line 180
    .line 181
    invoke-interface {v7, p0}, Lhf/d0;->n(Lac/i;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-ne v2, v6, :cond_6

    .line 186
    .line 187
    :goto_2
    return-object v6

    .line 188
    :cond_6
    move v5, v0

    .line 189
    move v0, p1

    .line 190
    move-object p1, v2

    .line 191
    move v2, v5

    .line 192
    move v5, v1

    .line 193
    move v1, v8

    .line 194
    :goto_3
    check-cast p1, Lub/k;

    .line 195
    .line 196
    iget-object v6, p1, Lub/k;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v6, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    iget-object p1, p1, Lub/k;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p1, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    add-int/2addr v5, v1

    .line 213
    add-int/2addr v5, v6

    .line 214
    new-instance v1, Ljava/lang/Integer;

    .line 215
    .line 216
    invoke-direct {v1, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 217
    .line 218
    .line 219
    add-int/2addr v2, v0

    .line 220
    add-int/2addr v2, p1

    .line 221
    new-instance p1, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-direct {p1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 224
    .line 225
    .line 226
    new-array v0, v4, [Ljava/lang/Object;

    .line 227
    .line 228
    const/4 v2, 0x0

    .line 229
    aput-object v1, v0, v2

    .line 230
    .line 231
    aput-object p1, v0, v3

    .line 232
    .line 233
    const p1, 0x7f0c0050

    .line 234
    .line 235
    .line 236
    invoke-static {p1, v0}, Lna/q;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const/4 v5, 0x0

    .line 241
    const/16 v6, 0x1ff

    .line 242
    .line 243
    const-wide/16 v2, 0x0

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    invoke-static/range {v1 .. v6}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 247
    .line 248
    .line 249
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 250
    .line 251
    return-object p1
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

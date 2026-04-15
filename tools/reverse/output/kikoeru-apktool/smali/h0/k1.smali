.class public final Lh0/k1;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public synthetic g:Lu/i1;

.field public synthetic h:J

.field public final synthetic i:Lw/k;

.field public final synthetic j:Lx0/w0;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhf/y;Lx0/w0;Lw/k;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/k1;->e:I

    .line 1
    iput-object p1, p0, Lh0/k1;->k:Ljava/lang/Object;

    iput-object p2, p0, Lh0/k1;->j:Lx0/w0;

    iput-object p3, p0, Lh0/k1;->i:Lw/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lw/k;Lx0/w0;Lx0/w0;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/k1;->e:I

    .line 2
    iput-object p1, p0, Lh0/k1;->i:Lw/k;

    iput-object p2, p0, Lh0/k1;->j:Lx0/w0;

    iput-object p3, p0, Lh0/k1;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lh0/k1;->e:I

    .line 2
    .line 3
    check-cast p1, Lu/i1;

    .line 4
    .line 5
    check-cast p2, Lp1/b;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v0, p2, Lp1/b;->a:J

    .line 11
    .line 12
    check-cast p3, Lyb/c;

    .line 13
    .line 14
    new-instance p2, Lh0/k1;

    .line 15
    .line 16
    iget-object v2, p0, Lh0/k1;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lx0/w0;

    .line 19
    .line 20
    iget-object v3, p0, Lh0/k1;->i:Lw/k;

    .line 21
    .line 22
    iget-object v4, p0, Lh0/k1;->j:Lx0/w0;

    .line 23
    .line 24
    invoke-direct {p2, v3, v4, v2, p3}, Lh0/k1;-><init>(Lw/k;Lx0/w0;Lx0/w0;Lyb/c;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p2, Lh0/k1;->g:Lu/i1;

    .line 28
    .line 29
    iput-wide v0, p2, Lh0/k1;->h:J

    .line 30
    .line 31
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lh0/k1;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_0
    iget-wide v0, p2, Lp1/b;->a:J

    .line 39
    .line 40
    check-cast p3, Lyb/c;

    .line 41
    .line 42
    new-instance p2, Lh0/k1;

    .line 43
    .line 44
    iget-object v2, p0, Lh0/k1;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lhf/y;

    .line 47
    .line 48
    iget-object v3, p0, Lh0/k1;->j:Lx0/w0;

    .line 49
    .line 50
    iget-object v4, p0, Lh0/k1;->i:Lw/k;

    .line 51
    .line 52
    invoke-direct {p2, v2, v3, v4, p3}, Lh0/k1;-><init>(Lhf/y;Lx0/w0;Lw/k;Lyb/c;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p2, Lh0/k1;->g:Lu/i1;

    .line 56
    .line 57
    iput-wide v0, p2, Lh0/k1;->h:J

    .line 58
    .line 59
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lh0/k1;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh0/k1;->e:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lh0/k1;->k:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v9, v0, Lh0/k1;->g:Lu/i1;

    .line 19
    .line 20
    iget-wide v10, v0, Lh0/k1;->h:J

    .line 21
    .line 22
    iget v1, v0, Lh0/k1;->f:I

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    if-ne v1, v6, :cond_1

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    move-object v5, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v14, v3

    .line 43
    check-cast v14, Lx0/w0;

    .line 44
    .line 45
    iput-object v2, v0, Lh0/k1;->g:Lu/i1;

    .line 46
    .line 47
    iput-wide v10, v0, Lh0/k1;->h:J

    .line 48
    .line 49
    iput v6, v0, Lh0/k1;->f:I

    .line 50
    .line 51
    sget-object v1, Lla/j;->b:Lh2/g;

    .line 52
    .line 53
    new-instance v8, Lla/i;

    .line 54
    .line 55
    const/4 v15, 0x0

    .line 56
    iget-object v12, v0, Lh0/k1;->i:Lw/k;

    .line 57
    .line 58
    iget-object v13, v0, Lh0/k1;->j:Lx0/w0;

    .line 59
    .line 60
    invoke-direct/range {v8 .. v15}, Lla/i;-><init>(Lu/i1;JLw/k;Lx0/w0;Lx0/w0;Lyb/c;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v8, v0}, Lhf/a0;->k(Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-ne v1, v5, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object v1, v7

    .line 71
    :goto_0
    if-ne v1, v5, :cond_0

    .line 72
    .line 73
    :goto_1
    return-object v5

    .line 74
    :pswitch_0
    check-cast v3, Lhf/y;

    .line 75
    .line 76
    iget v1, v0, Lh0/k1;->f:I

    .line 77
    .line 78
    const/4 v8, 0x3

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    if-ne v1, v6, :cond_4

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :cond_5
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lh0/k1;->g:Lu/i1;

    .line 99
    .line 100
    iget-wide v11, v0, Lh0/k1;->h:J

    .line 101
    .line 102
    new-instance v9, Lb0/z;

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x2

    .line 106
    iget-object v10, v0, Lh0/k1;->j:Lx0/w0;

    .line 107
    .line 108
    iget-object v13, v0, Lh0/k1;->i:Lw/k;

    .line 109
    .line 110
    invoke-direct/range {v9 .. v15}, Lb0/z;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lyb/c;I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v2, v2, v9, v8}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 114
    .line 115
    .line 116
    iput v6, v0, Lh0/k1;->f:I

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Lu/i1;->g(Lac/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne v1, v5, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    new-instance v4, Lb0/w;

    .line 132
    .line 133
    iget-object v5, v0, Lh0/k1;->j:Lx0/w0;

    .line 134
    .line 135
    iget-object v6, v0, Lh0/k1;->i:Lw/k;

    .line 136
    .line 137
    invoke-direct {v4, v5, v1, v6, v2}, Lb0/w;-><init>(Lx0/w0;ZLw/k;Lyb/c;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v2, v2, v4, v8}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 141
    .line 142
    .line 143
    move-object v5, v7

    .line 144
    :goto_3
    return-object v5

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

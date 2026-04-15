.class public final Lda/c0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:J

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lda/m0;JZLyb/c;I)V
    .locals 0

    .line 1
    iput p6, p0, Lda/c0;->e:I

    iput-object p1, p0, Lda/c0;->g:Ljava/lang/Object;

    iput-wide p2, p0, Lda/c0;->h:J

    iput-boolean p4, p0, Lda/c0;->i:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(ZLi3/h;JLyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lda/c0;->e:I

    .line 2
    iput-boolean p1, p0, Lda/c0;->i:Z

    iput-object p2, p0, Lda/c0;->g:Ljava/lang/Object;

    iput-wide p3, p0, Lda/c0;->h:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 8

    .line 1
    iget p1, p0, Lda/c0;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lda/c0;

    .line 7
    .line 8
    iget-object p1, p0, Lda/c0;->g:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Li3/h;

    .line 12
    .line 13
    iget-wide v3, p0, Lda/c0;->h:J

    .line 14
    .line 15
    iget-boolean v1, p0, Lda/c0;->i:Z

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v5}, Lda/c0;-><init>(ZLi3/h;JLyb/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v6, p2

    .line 23
    new-instance v1, Lda/c0;

    .line 24
    .line 25
    iget-object p1, p0, Lda/c0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Lda/m0;

    .line 29
    .line 30
    iget-boolean v5, p0, Lda/c0;->i:Z

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    iget-wide v3, p0, Lda/c0;->h:J

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, Lda/c0;-><init>(Lda/m0;JZLyb/c;I)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_1
    move-object v6, p2

    .line 40
    new-instance v1, Lda/c0;

    .line 41
    .line 42
    iget-object p1, p0, Lda/c0;->g:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v2, p1

    .line 45
    check-cast v2, Lda/m0;

    .line 46
    .line 47
    iget-boolean v5, p0, Lda/c0;->i:Z

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    iget-wide v3, p0, Lda/c0;->h:J

    .line 51
    .line 52
    invoke-direct/range {v1 .. v7}, Lda/c0;-><init>(Lda/m0;JZLyb/c;I)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lda/c0;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lda/c0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lda/c0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lda/c0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lda/c0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lda/c0;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lda/c0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lda/c0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lda/c0;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lda/c0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lda/c0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/c0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li3/h;

    .line 9
    .line 10
    iget v1, p0, Lda/c0;->f:I

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v7, p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v7, p0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, p0, Lda/c0;->i:Z

    .line 42
    .line 43
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    iget-object v4, v0, Li3/h;->a:Lb2/d;

    .line 48
    .line 49
    iput v3, p0, Lda/c0;->f:I

    .line 50
    .line 51
    const-wide/16 v5, 0x0

    .line 52
    .line 53
    iget-wide v7, p0, Lda/c0;->h:J

    .line 54
    .line 55
    move-object v9, p0

    .line 56
    invoke-virtual/range {v4 .. v9}, Lb2/d;->a(JJLac/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v7, v9

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    :goto_0
    check-cast p1, Lf3/q;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move-object v7, p0

    .line 71
    iget-object p1, v0, Li3/h;->a:Lb2/d;

    .line 72
    .line 73
    iput v2, v7, Lda/c0;->f:I

    .line 74
    .line 75
    iget-wide v3, v7, Lda/c0;->h:J

    .line 76
    .line 77
    const-wide/16 v5, 0x0

    .line 78
    .line 79
    move-object v2, p1

    .line 80
    invoke-virtual/range {v2 .. v7}, Lb2/d;->a(JJLac/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v1, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    :goto_1
    check-cast p1, Lf3/q;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    :goto_2
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 93
    .line 94
    :goto_3
    return-object v1

    .line 95
    :pswitch_0
    move-object v7, p0

    .line 96
    iget v0, v7, Lda/c0;->f:I

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    if-ne v0, v1, :cond_6

    .line 102
    .line 103
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_7
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, v7, Lda/c0;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lda/m0;

    .line 121
    .line 122
    iput v1, v7, Lda/c0;->f:I

    .line 123
    .line 124
    iget-wide v0, v7, Lda/c0;->h:J

    .line 125
    .line 126
    iget-boolean v2, v7, Lda/c0;->i:Z

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1, p0, v2}, Lda/m0;->G(JLac/c;Z)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 133
    .line 134
    if-ne p1, v0, :cond_8

    .line 135
    .line 136
    move-object p1, v0

    .line 137
    :cond_8
    :goto_4
    return-object p1

    .line 138
    :pswitch_1
    move-object v7, p0

    .line 139
    iget v0, v7, Lda/c0;->f:I

    .line 140
    .line 141
    const/4 v1, 0x1

    .line 142
    if-eqz v0, :cond_a

    .line 143
    .line 144
    if-ne v0, v1, :cond_9

    .line 145
    .line 146
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 153
    .line 154
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_a
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object p1, v7, Lda/c0;->g:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, Lda/m0;

    .line 164
    .line 165
    iput v1, v7, Lda/c0;->f:I

    .line 166
    .line 167
    iget-wide v0, v7, Lda/c0;->h:J

    .line 168
    .line 169
    iget-boolean v2, v7, Lda/c0;->i:Z

    .line 170
    .line 171
    invoke-virtual {p1, v0, v1, p0, v2}, Lda/m0;->H(JLac/c;Z)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 176
    .line 177
    if-ne p1, v0, :cond_b

    .line 178
    .line 179
    move-object p1, v0

    .line 180
    :cond_b
    :goto_5
    return-object p1

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

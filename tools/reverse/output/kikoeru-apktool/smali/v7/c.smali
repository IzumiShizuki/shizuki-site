.class public final Lv7/c;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public final synthetic g:Ln7/v;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lic/k;


# direct methods
.method public constructor <init>(Ln7/v;ZZLic/k;Lyb/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv7/c;->e:I

    .line 1
    iput-object p1, p0, Lv7/c;->g:Ln7/v;

    iput-boolean p2, p0, Lv7/c;->h:Z

    iput-boolean p3, p0, Lv7/c;->i:Z

    iput-object p4, p0, Lv7/c;->j:Lic/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lyb/c;Ln7/v;ZZLic/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv7/c;->e:I

    .line 2
    iput-object p2, p0, Lv7/c;->g:Ln7/v;

    iput-boolean p3, p0, Lv7/c;->h:Z

    iput-boolean p4, p0, Lv7/c;->i:Z

    iput-object p5, p0, Lv7/c;->j:Lic/k;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 7

    .line 1
    iget p1, p0, Lv7/c;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv7/c;

    .line 7
    .line 8
    iget-boolean v4, p0, Lv7/c;->i:Z

    .line 9
    .line 10
    iget-object v5, p0, Lv7/c;->j:Lic/k;

    .line 11
    .line 12
    iget-object v2, p0, Lv7/c;->g:Ln7/v;

    .line 13
    .line 14
    iget-boolean v3, p0, Lv7/c;->h:Z

    .line 15
    .line 16
    move-object v1, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lv7/c;-><init>(Lyb/c;Ln7/v;ZZLic/k;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v1, p2

    .line 22
    new-instance p1, Lv7/c;

    .line 23
    .line 24
    iget-boolean v4, p0, Lv7/c;->i:Z

    .line 25
    .line 26
    iget-object v5, p0, Lv7/c;->j:Lic/k;

    .line 27
    .line 28
    iget-object v2, p0, Lv7/c;->g:Ln7/v;

    .line 29
    .line 30
    iget-boolean v3, p0, Lv7/c;->h:Z

    .line 31
    .line 32
    move-object v6, v1

    .line 33
    move-object v1, p1

    .line 34
    invoke-direct/range {v1 .. v6}, Lv7/c;-><init>(Ln7/v;ZZLic/k;Lyb/c;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 1

    .line 1
    iget v0, p0, Lv7/c;->e:I

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
    invoke-virtual {p0, p1, p2}, Lv7/c;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lv7/c;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lv7/c;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lv7/c;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lv7/c;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lv7/c;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lv7/c;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lv7/c;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lv7/b;

    .line 29
    .line 30
    iget-object v7, p0, Lv7/c;->j:Lic/k;

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    iget-boolean v3, p0, Lv7/c;->i:Z

    .line 34
    .line 35
    iget-boolean v4, p0, Lv7/c;->h:Z

    .line 36
    .line 37
    iget-object v5, p0, Lv7/c;->g:Ln7/v;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct/range {v2 .. v8}, Lv7/b;-><init>(ZZLn7/v;Lyb/c;Lic/k;I)V

    .line 41
    .line 42
    .line 43
    iput v1, p0, Lv7/c;->f:I

    .line 44
    .line 45
    invoke-virtual {v5, v4, v2, p0}, Ln7/v;->n(ZLic/n;Lac/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 50
    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    move-object p1, v0

    .line 54
    :cond_2
    :goto_0
    return-object p1

    .line 55
    :pswitch_0
    iget v0, p0, Lv7/c;->f:I

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_4
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lv7/c;->g:Ln7/v;

    .line 78
    .line 79
    invoke-virtual {p1}, Ln7/v;->j()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p1}, Ln7/v;->k()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_6

    .line 90
    .line 91
    :cond_5
    iget-boolean p1, p0, Lv7/c;->h:Z

    .line 92
    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    goto :goto_1

    .line 97
    :cond_6
    const/4 p1, 0x0

    .line 98
    const/4 v3, 0x0

    .line 99
    :goto_1
    new-instance v2, Lv7/b;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v8, 0x0

    .line 103
    iget-boolean v4, p0, Lv7/c;->i:Z

    .line 104
    .line 105
    iget-object v5, p0, Lv7/c;->g:Ln7/v;

    .line 106
    .line 107
    iget-object v7, p0, Lv7/c;->j:Lic/k;

    .line 108
    .line 109
    invoke-direct/range {v2 .. v8}, Lv7/b;-><init>(ZZLn7/v;Lyb/c;Lic/k;I)V

    .line 110
    .line 111
    .line 112
    iput v1, p0, Lv7/c;->f:I

    .line 113
    .line 114
    invoke-virtual {v5, v4, v2, p0}, Ln7/v;->n(ZLic/n;Lac/c;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 119
    .line 120
    if-ne p1, v0, :cond_7

    .line 121
    .line 122
    move-object p1, v0

    .line 123
    :cond_7
    :goto_2
    return-object p1

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

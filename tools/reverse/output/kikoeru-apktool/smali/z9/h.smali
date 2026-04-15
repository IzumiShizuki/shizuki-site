.class public final synthetic Lz9/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lz9/r;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lz9/r;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lz9/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/h;->b:Ljava/lang/String;

    iput-object p2, p0, Lz9/h;->c:Lz9/r;

    return-void
.end method

.method public synthetic constructor <init>(Lz9/r;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lz9/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/h;->c:Lz9/r;

    iput-object p2, p0, Lz9/h;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz9/h;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, Lz9/h;->c:Lz9/r;

    .line 11
    .line 12
    iget-object v7, v0, Lz9/h;->b:Ljava/lang/String;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v12, p1

    .line 18
    .line 19
    check-cast v12, Lx0/o;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v8, v1, 0x3

    .line 30
    .line 31
    if-eq v8, v4, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    :cond_0
    and-int/2addr v1, v5

    .line 35
    invoke-virtual {v12, v1, v3}, Lx0/o;->N(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, v6, Lz9/r;->h:Lx0/e1;

    .line 42
    .line 43
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v7, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    const/16 v13, 0x30

    .line 54
    .line 55
    const/16 v14, 0x3c

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static/range {v8 .. v14}, Lm0/i5;->a(ZLj1/q;ZLm0/u1;Lx0/o;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v12}, Lx0/o;->Q()V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-object v2

    .line 68
    :pswitch_0
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, Lx0/o;

    .line 71
    .line 72
    move-object/from16 v8, p2

    .line 73
    .line 74
    check-cast v8, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    and-int/lit8 v9, v8, 0x3

    .line 81
    .line 82
    if-eq v9, v4, :cond_2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    :cond_2
    and-int/lit8 v4, v8, 0x1

    .line 86
    .line 87
    invoke-virtual {v1, v4, v3}, Lx0/o;->N(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    iget-object v3, v6, Lz9/r;->i:Lx0/e1;

    .line 94
    .line 95
    invoke-virtual {v3}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, [B

    .line 100
    .line 101
    invoke-static {v7}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v5, "forName(...)"

    .line 106
    .line 107
    invoke-static {v4, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object v5, Lna/w;->a:Lxf/r;

    .line 111
    .line 112
    const-string v5, "<this>"

    .line 113
    .line 114
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v13, Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {v13, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 120
    .line 121
    .line 122
    const/16 v34, 0x0

    .line 123
    .line 124
    const v35, 0x1fffe

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const-wide/16 v15, 0x0

    .line 129
    .line 130
    const-wide/16 v17, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const-wide/16 v21, 0x0

    .line 137
    .line 138
    const/16 v23, 0x0

    .line 139
    .line 140
    const/16 v24, 0x0

    .line 141
    .line 142
    const-wide/16 v25, 0x0

    .line 143
    .line 144
    const/16 v27, 0x0

    .line 145
    .line 146
    const/16 v28, 0x0

    .line 147
    .line 148
    const/16 v29, 0x0

    .line 149
    .line 150
    const/16 v30, 0x0

    .line 151
    .line 152
    const/16 v31, 0x0

    .line 153
    .line 154
    const/16 v33, 0x0

    .line 155
    .line 156
    move-object/from16 v32, v1

    .line 157
    .line 158
    invoke-static/range {v13 .. v35}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    move-object/from16 v32, v1

    .line 163
    .line 164
    invoke-virtual/range {v32 .. v32}, Lx0/o;->Q()V

    .line 165
    .line 166
    .line 167
    :goto_1
    return-object v2

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

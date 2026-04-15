.class public final synthetic Lm0/v4;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lic/k;

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lt2/l0;

.field public final synthetic g:Lic/n;

.field public final synthetic h:Lic/n;

.field public final synthetic i:Lic/n;

.field public final synthetic j:Lic/n;

.field public final synthetic k:Z

.field public final synthetic l:Ly2/g0;

.field public final synthetic m:Lh0/t0;

.field public final synthetic n:Lh0/s0;

.field public final synthetic o:Z

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Lq1/l0;

.field public final synthetic s:Lm0/x1;

.field public final synthetic t:I

.field public final synthetic u:I

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lic/n;Lic/n;Lic/n;Lic/n;ZLy2/g0;Lh0/t0;Lh0/s0;ZIILq1/l0;Lm0/x1;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/v4;->a:Ljava/lang/String;

    iput-object p2, p0, Lm0/v4;->b:Lic/k;

    iput-object p3, p0, Lm0/v4;->c:Lj1/q;

    iput-boolean p4, p0, Lm0/v4;->d:Z

    iput-boolean p5, p0, Lm0/v4;->e:Z

    iput-object p6, p0, Lm0/v4;->f:Lt2/l0;

    iput-object p7, p0, Lm0/v4;->g:Lic/n;

    iput-object p8, p0, Lm0/v4;->h:Lic/n;

    iput-object p9, p0, Lm0/v4;->i:Lic/n;

    iput-object p10, p0, Lm0/v4;->j:Lic/n;

    iput-boolean p11, p0, Lm0/v4;->k:Z

    iput-object p12, p0, Lm0/v4;->l:Ly2/g0;

    iput-object p13, p0, Lm0/v4;->m:Lh0/t0;

    iput-object p14, p0, Lm0/v4;->n:Lh0/s0;

    iput-boolean p15, p0, Lm0/v4;->o:Z

    move/from16 p1, p16

    iput p1, p0, Lm0/v4;->p:I

    move/from16 p1, p17

    iput p1, p0, Lm0/v4;->q:I

    move-object/from16 p1, p18

    iput-object p1, p0, Lm0/v4;->r:Lq1/l0;

    move-object/from16 p1, p19

    iput-object p1, p0, Lm0/v4;->s:Lm0/x1;

    move/from16 p1, p20

    iput p1, p0, Lm0/v4;->t:I

    move/from16 p1, p21

    iput p1, p0, Lm0/v4;->u:I

    move/from16 p1, p22

    iput p1, p0, Lm0/v4;->v:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v20, p1

    .line 4
    .line 5
    check-cast v20, Lx0/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lm0/v4;->t:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 19
    .line 20
    .line 21
    move-result v21

    .line 22
    iget v1, v0, Lm0/v4;->u:I

    .line 23
    .line 24
    invoke-static {v1}, Lx0/v;->D(I)I

    .line 25
    .line 26
    .line 27
    move-result v22

    .line 28
    iget-object v1, v0, Lm0/v4;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, v0, Lm0/v4;->b:Lic/k;

    .line 31
    .line 32
    iget-object v3, v0, Lm0/v4;->c:Lj1/q;

    .line 33
    .line 34
    iget-boolean v4, v0, Lm0/v4;->d:Z

    .line 35
    .line 36
    iget-boolean v5, v0, Lm0/v4;->e:Z

    .line 37
    .line 38
    iget-object v6, v0, Lm0/v4;->f:Lt2/l0;

    .line 39
    .line 40
    iget-object v7, v0, Lm0/v4;->g:Lic/n;

    .line 41
    .line 42
    iget-object v8, v0, Lm0/v4;->h:Lic/n;

    .line 43
    .line 44
    iget-object v9, v0, Lm0/v4;->i:Lic/n;

    .line 45
    .line 46
    iget-object v10, v0, Lm0/v4;->j:Lic/n;

    .line 47
    .line 48
    iget-boolean v11, v0, Lm0/v4;->k:Z

    .line 49
    .line 50
    iget-object v12, v0, Lm0/v4;->l:Ly2/g0;

    .line 51
    .line 52
    iget-object v13, v0, Lm0/v4;->m:Lh0/t0;

    .line 53
    .line 54
    iget-object v14, v0, Lm0/v4;->n:Lh0/s0;

    .line 55
    .line 56
    iget-boolean v15, v0, Lm0/v4;->o:Z

    .line 57
    .line 58
    move-object/from16 v16, v1

    .line 59
    .line 60
    iget v1, v0, Lm0/v4;->p:I

    .line 61
    .line 62
    move/from16 v17, v1

    .line 63
    .line 64
    iget v1, v0, Lm0/v4;->q:I

    .line 65
    .line 66
    move/from16 v18, v1

    .line 67
    .line 68
    iget-object v1, v0, Lm0/v4;->r:Lq1/l0;

    .line 69
    .line 70
    move-object/from16 v19, v1

    .line 71
    .line 72
    iget-object v1, v0, Lm0/v4;->s:Lm0/x1;

    .line 73
    .line 74
    move-object/from16 v23, v1

    .line 75
    .line 76
    iget v1, v0, Lm0/v4;->v:I

    .line 77
    .line 78
    move-object/from16 v24, v23

    .line 79
    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    move-object/from16 v1, v16

    .line 83
    .line 84
    move/from16 v16, v17

    .line 85
    .line 86
    move/from16 v17, v18

    .line 87
    .line 88
    move-object/from16 v18, v19

    .line 89
    .line 90
    move-object/from16 v19, v24

    .line 91
    .line 92
    invoke-static/range {v1 .. v23}, Lm0/a5;->a(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lic/n;Lic/n;Lic/n;Lic/n;ZLy2/g0;Lh0/t0;Lh0/s0;ZIILq1/l0;Lm0/x1;Lx0/o;III)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 96
    .line 97
    return-object v1
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
